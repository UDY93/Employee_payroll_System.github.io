 class Fulltime_Employee extends Employee
{
    private double monthlysalary;

    Fulltime_Employee(String name,int id,double monthlysalary)
    {
        super(name,id);
        this.monthlysalary = monthlysalary;

    }
  @Override
    public double calculatesalary()
  {
      return monthlysalary;
  }

}
