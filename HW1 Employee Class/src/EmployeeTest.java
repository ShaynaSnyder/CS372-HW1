
public class EmployeeTest{
	public static void main(String[] args) {
		Employee employee1 = new Employee("Shayna", "Snyder", 11);
		Employee employee2 = new Employee("Wynter", "Nelson", 23);
		System.out.printf("Employee, %s %s, earns $%.2f yearly.\n",
				employee1.getFirstName(), employee1.getLastName(), employee1.getYSalary());
		System.out.printf("Employee, %s %s, earns $%.2f yearly.\n",
				employee2.getFirstName(), employee2.getLastName(), employee2.getYSalary());
		System.out.printf("Employee, %s %s, now earns $%.2f yearly after a 10 percent raise.\n",
				employee1.getFirstName(), employee1.getLastName(), employee1.getNewYSalary());
		System.out.printf("Employee, %s %s, now earns $%.2f yearly after a 10 percent raise.\n",
				employee2.getFirstName(), employee2.getLastName(), employee2.getNewYSalary());
	}

}
