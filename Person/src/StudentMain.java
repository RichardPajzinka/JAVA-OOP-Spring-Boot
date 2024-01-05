
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Student student = new Student();
		 * 
		 * student.setName("Richard"); student.setEmail("rpajzinka@gmail.com");
		 */

		Employee employee = new Employee("Richard", "Programmer");
		// employee.setName("Richard");
		employee.setEmail("rpajzinka@gmail.com");
		employee.setPhoneNumber("09058904421");
		employee.setEmployeeGrade('A');
		employee.setTitle("Programmer");

		System.out.println(employee);
	}

}
