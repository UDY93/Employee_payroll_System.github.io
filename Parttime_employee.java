public class Parttime_employee extends Employee {


    private int workinghour;

    private double hourrate;

    Parttime_employee(String name,int id,int workinghour,double hourrate)
    {
        super(name,id);
        this.workinghour = workinghour;
        this.hourrate = hourrate;
    }
    @Override
    public double calculatesalary()
    {
        return workinghour * hourrate;
    }

}
