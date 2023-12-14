
public class Main {
	public static void main(String args[]) {
		System.out.println("**************Welcome To Employee Payroll System*********************");
		System.out.println();
		PayrollSystem payrollSystem = new PayrollSystem();
		FullTimeEmployee emp1 = new FullTimeEmployee("Subhanki", 01, 5000.0);
		PartTimeEmployee emp2 = new PartTimeEmployee("Susmit", 02, 5, 500.0);

		payrollSystem.addEmployee(emp1);
		payrollSystem.addEmployee(emp2);
		System.out.println("Initial Employee Details:");
		payrollSystem.displayEmployees();
		System.out.println("Removing Employee");
		payrollSystem.removeEmployee(02);
		System.out.println("Remaining Employees Details:");
		payrollSystem.displayEmployees();
	}

}
