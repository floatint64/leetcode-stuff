package org.example;


import java.util.List;

public class EmployeeImportance {
    public int getImportance(List<Employee> employees, int id) {
        Employee[] orderedEmployees = new Employee[2001];

        for (var employee : employees) {
            orderedEmployees[employee.id] = employee;
        }

        return getImportanceSub(orderedEmployees, id);
    }

    private static int getImportanceSub(Employee[] employees, int id) {

        int val = employees[id].importance;

        for (var sid : employees[id].subordinates) {
            val += getImportanceSub(employees, sid);
        }

        return val;
    }

    public static class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;

        public Employee(int id, int importance, List<Integer> subordinates) {
            this.id = id;
            this.importance = importance;
            this.subordinates = subordinates;
        }
    }
}
