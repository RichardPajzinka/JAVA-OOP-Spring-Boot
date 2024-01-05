
public class Student extends Person {
	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private String collegeName;
	private int year;

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
