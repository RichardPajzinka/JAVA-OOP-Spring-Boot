import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub

		return Integer.compare(student1.getId(), student2.getId());
	}

}

public class StudentsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// vytovrniee listu na zaklade objektu pre studentov
		List<Student> students = List.of(new Student(1, "Richard"), new Student(100, "adam"), new Student(2, "eve"));

		List<Student> studentAl = new ArrayList<>(students);

		System.out.println(studentAl);

		Collections.sort(studentAl);
		System.out.println("asc" + studentAl);

		// Collections.sort(studentAl, new DescendingStudentComparator());
		studentAl.sort(new DescendingStudentComparator());
		System.out.println("asc" + studentAl);
	}


}
