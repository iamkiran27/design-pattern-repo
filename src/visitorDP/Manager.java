package visitorDP;

public class Manager implements  AcceptI{

    private  String name;
    private static  double salary = 10000;

    public Manager(String name) {
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
