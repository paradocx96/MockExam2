package Question02;

public class Lecturer implements IPerson{
	
	String employeeID;
	String department;
	
	public Lecturer(String employeeID, String department) {
		this.employeeID = employeeID;
		this.department = department;
	}

	@Override
	public String displayDetails() {
		return "Lecturer = "+employeeID+", Department = "+department;
	}
}
