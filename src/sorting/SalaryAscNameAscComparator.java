package sorting;

import java.util.Comparator;

public class SalaryAscNameAscComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        int cmpsalary=0;
        if(o1.getSalary()>o2.getSalary()) cmpsalary = 1;
        if(o1.getSalary()<o2.getSalary()) cmpsalary = -1;
        if (o1.getSalary() == o2.getSalary()) {
            return o1.getName().compareTo(o2.getName());
        }
        return cmpsalary;
    }
}
