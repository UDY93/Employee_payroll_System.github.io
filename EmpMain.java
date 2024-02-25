public class EmpMain {
    public static void main(String[]args)
    {
        Payroll_system payrollSystem = new Payroll_system();
        Fulltime_Employee fulltimeEmployee = new Fulltime_Employee("uday",1,86000);
        Parttime_employee parttimeEmployee = new Parttime_employee("priyanka",2,45,80);

        payrollSystem.addEmployee(fulltimeEmployee);
        payrollSystem.addEmployee(parttimeEmployee);

        System.out.println("employees details :" );
        payrollSystem.displayEmployee();
        System.out.println(" removing employees:" );
        payrollSystem.removeEmployee(2);
        System.out.println(" remening employees:" );
        payrollSystem.displayEmployee();
    }
}
