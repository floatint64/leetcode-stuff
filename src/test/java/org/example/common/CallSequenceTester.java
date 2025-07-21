package org.example.common;

import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;

public class CallSequenceTester {

    public static void assertCallSequence(
            Object testedObject,
            List<String> methodNames,
            List<List<Object>> parameters,
            List<Object> expectedResults
    )  throws Exception {

        if (methodNames.size() != parameters.size() || methodNames.size() != expectedResults.size()) {
            throw new IllegalArgumentException("Inconsistent lists");
        }

        for (int i = 0; i < methodNames.size(); i++) {
            String methodName = methodNames.get(i);
            List<Object> params = parameters.get(i);
            Object expected = expectedResults.get(i);

            Class<?>[] paramTypes = new Class<?>[params.size()];
            Object[] paramValues = new Object[params.size()];

            for (int j = 0; j < params.size(); j++) {
                paramValues[j] = params.get(j);
                paramTypes[j] = params.get(j).getClass();

                if (paramValues[j] instanceof Integer) {
                    paramTypes[j] = int.class;
                } else if (paramValues[j] instanceof Boolean) {
                    paramTypes[j] = boolean.class;
                }
                // TODO: add more types
            }


            java.lang.reflect.Method method = testedObject.getClass()
                    .getMethod(methodName, paramTypes);


            Object result = method.invoke(testedObject, paramValues);

            if (method.getReturnType() == void.class) {
                Assertions.assertNull(expected);
            } else {
                Assertions.assertEquals(expected, result, String.format("[%d] %s(%s)", i, methodName, Arrays.toString(paramValues)));
            }
        }
    }
}
