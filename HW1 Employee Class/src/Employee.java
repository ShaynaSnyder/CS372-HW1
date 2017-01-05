
public class Employee {
	String firstName, lastName;
	double mSalary, ySalary, newYSalary;
	public Employee(String f, String l, double m) {
		firstName = f;
		lastName = l;
		if(m>=0)
			mSalary = m;
		ySalary = 12*m;
		newYSalary = 1.1*12*m;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public double getYSalary() {
		return ySalary;
	}
	public double getNewYSalary() {
		return newYSalary;
	}
}
