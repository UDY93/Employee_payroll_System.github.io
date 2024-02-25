import java.util.ArrayList;

public class Payroll_system {

   private ArrayList<Employee> Employelist;

   Payroll_system()
   {
       Employelist = new ArrayList<>();

   }

   public void addEmployee(Employee employee)
   {
       Employelist.add(employee);
   }

   public void removeEmployee(int id)
   {
       Employee toremoveEmployee =null;
       for (Employee employee : Employelist)
       {
           if (employee.getId()==id)
           {
               toremoveEmployee = employee;
               break;
           }
       }

       if (toremoveEmployee != null)
       {
           Employelist.remove(toremoveEmployee);
       }
   }

   public void displayEmployee()
   {
       for (Employee employee : Employelist)
       {
           System.out.println(employee);

       }
   }
}
