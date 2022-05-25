package visitorDP;

public class Employee implements AcceptI{
private  String name;
private static  double salary = 10000;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.increseSalary(this);
    }

    public void  incrementSalary(double rate)
    {
salary = salary * rate + salary;
    }
    public static double  getSalary()
    {
        return   salary;
    }


}
