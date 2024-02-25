abstract class Employee
{
    private String name;

    private int id;

    Employee(String name,int id)
    {
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }
    public void setId(String name)
    {
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   public abstract double calculatesalary();

    @Override
    public String toString()
    {
        return "Employee[name="+name+", id="+id+", salary="+calculatesalary()+"]";
    }
}