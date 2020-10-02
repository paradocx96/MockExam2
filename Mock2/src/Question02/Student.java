package Question02;

public class Student implements IPerson{
	
	String studetID;
	int grade;
	
	public Student(String studetID, int grade) {
		this.studetID = studetID;
		this.grade = grade;
	}

	@Override
	public String displayDetails() {
		return "Student = "+studetID+", Grade = "+grade;
	}
}
