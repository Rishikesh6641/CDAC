package Employee;

public class Employee {
	
	private static double total_salary;
	private static int total_employee;
	private static float per;
	private int empid;
	private String name;
	private double in_salary;
	
	
	static {
		total_employee=0;
		total_salary=0;
		 per=0.0f;	
	}
	
	public Employee()
	{
		this.empid=0;
		this.name=null;
		this.in_salary=0.0;
		Employee.total_employee++;
	}
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getIn_salary() {
		return in_salary;
	}
	
	public void setIn_salary(double in_salary) {
		this.in_salary = in_salary;
		Employee.total_salary=Employee.total_salary+this.in_salary;
	}

	public static float getPer() {
		return per;
	}

	public static void setPer(float per) {
		Employee.per = per;
	}
	
	public void raise()
	{
		double raise=(Employee.per/100)*this.in_salary;
		Employee.total_salary=Employee.total_salary-this.in_salary;
		this.in_salary=this.in_salary+raise;
		Employee.total_salary=Employee.total_salary+this.in_salary;
	}
	
	public static int getTotal_employee() {
		return total_employee;
	}
	
	public static double getTotal_salary()
	{
		return Employee.total_salary;
	}
}
