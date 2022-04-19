package mvcdemos;

import java.util.ArrayList;
import java.util.List;


public class StudentsData {

	public static List<students> getStudents() {
		List<students> students = new ArrayList<students>();
		
		students.add(new students("John", "Wilson", "jwil@example.com"));
		students.add(new students("Alex", "Johnson", "aj@example.com"));
		students.add(new students("William", "Ray", "rwil@example.com"));
		students.add(new students("Max", "Jackson", "maxjack@example.com"));
		
		return students;
	}
	
}