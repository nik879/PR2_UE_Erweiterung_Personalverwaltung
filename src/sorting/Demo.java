package sorting;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Employee Niki = new Employee(15, "nik kachel", 15_000, "It");
        Employee Hannes = new Employee(3, "hannes temm", 60_000, "FT");
        Employee Max = new Employee(1, "Max men", 120_000, "Exp");

        Employee[] employees = {Niki, Hannes, Max};

        System.out.println("Unsortiert");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("Sortiert nach empNumber");
        Arrays.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
