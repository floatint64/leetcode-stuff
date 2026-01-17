package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeImportanceTest {

    @Test
    void getImportance() {
        EmployeeImportance employeeImportance = new EmployeeImportance();

        var employees = List.of(
                new EmployeeImportance.Employee(1,5, List.of(2,3)),
                new EmployeeImportance.Employee(2, 3, List.of()),
                new EmployeeImportance.Employee(3, 3, List.of())
        );

        int expected = 11;

        Assertions.assertEquals(expected, employeeImportance.getImportance(employees, 1));
    }

    @Test
    void getImportance2() {
        EmployeeImportance employeeImportance = new EmployeeImportance();

        var employees = List.of(
                new EmployeeImportance.Employee(1,2, List.of(5)),
                new EmployeeImportance.Employee(5, -3, List.of())
        );

        int expected = -3;

        Assertions.assertEquals(expected, employeeImportance.getImportance(employees, 5));
    }

    @Test
    void getImportance3() {
        EmployeeImportance employeeImportance = new EmployeeImportance();

        var employees = List.of(
                new EmployeeImportance.Employee(1,5, List.of(2)),
                new EmployeeImportance.Employee(2, 3, List.of(3)),
                new EmployeeImportance.Employee(3, 3, List.of())
        );

        int expected = 11;

        Assertions.assertEquals(expected, employeeImportance.getImportance(employees, 1));
    }
}