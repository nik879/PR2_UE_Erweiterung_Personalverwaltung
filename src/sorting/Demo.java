package sorting;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Employee Niki = new Employee(15, "nikkachel", 15_000, "It");
        Employee Hannes = new Employee(3, "hannestemm", 60_000, "FT");
        Employee Max = new Employee(1, "maxmen", 120_000, "Exp");
        Employee Franz = new Employee(12, "franz", 360_000, "Exp");
        Employee Susi = new Employee(11, "susi", 15_000, "Rft");

        Employee[] employees = {Niki, Hannes, Max, Franz, Susi};

        System.out.println("Unsortiert");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("Sortiert nach empNumber");
        Arrays.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("Sortiert nach Name");
        Arrays.sort(employees,new NameAscComparator());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("Sortiert nach Salary");
        Arrays.sort(employees,new SalaryDescComparator());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("Sortiert nach Department(Auf.) und Name(abs.)");
        Arrays.sort(employees,new DepartmentAscNameDescComparator());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("Sortiert nach Salary(Auf.) und Name(Auf.)");
        Arrays.sort(employees,new SalaryAscNameAscComparator());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
