package visitorDP;

public class VisitorImp implements Visitor {
    @Override
    public void increseSalary(Employee employee) {
employee.incrementSalary(0.2);
    }

    @Override
    public void increseSalary(Manager manager) {
manager.incrementSalary(0.4);
    }
}
