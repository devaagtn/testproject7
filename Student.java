
public class Student {

	private int rollno;
		private int marks;
	private String name;
	private int percentage;
	private int class;
	public Student(int rollno, int marks, String name, int percentage) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
		this.percentage = percentage;
	}
	public Student() {
		super();
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
	
	
}
