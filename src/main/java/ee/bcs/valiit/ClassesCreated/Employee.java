package ee.bcs.valiit.ClassesCreated;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    public String name;
    public String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Employee> employee() {
        Employee employee = new Employee();
        employee.setName("Karl");
        employee.setAddress("Tartu");
        Employee employee1 = new Employee();
        employee1.setName("Mari");
        employee1.setAddress("Elva");
        List<Employee> list = new ArrayList<>();
//        list.add(employee);
//        list.add(employee1);
        return list;
    }
}
