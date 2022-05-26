package visitorDP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Visitor visitor = new VisitorImp();
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("ram"));
        employeeList.add(new Employee("ravi"));
        employeeList.add(new Employee("sai"));
        List<Manager> managerList = new ArrayList<>();
        managerList.add(new Manager("John"));
        managerList.add(new Manager("Karan"));
        System.out.println("Employee salary is : "+Employee.getSalary());
        System.out.println("After increment employee salary is : ");
        for (Employee e: employeeList
             ) {

            e.accept(visitor);

        }
        System.out.println("Employee salary is : "+Employee.getSalary());

        System.out.println("Manager salary is : "+Manager.getSalary());
        System.out.println("After increment manager salary is : ");
        for (Manager e: managerList
        ) {

            e.accept(visitor);

        }
        System.out.println("Manager salary is : "+Manager.getSalary());

    }
}
