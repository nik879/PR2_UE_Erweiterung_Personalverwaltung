package sorting;

import java.util.Comparator;

public class DepartmentAscNameDescComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int cmpdep = o1.getDepartment().compareTo(o2.getDepartment());
        if (cmpdep == 0) {
            return o2.getName().compareTo(o1.getName());
        }
        return cmpdep;
    }
}
