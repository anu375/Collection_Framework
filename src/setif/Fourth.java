package setif;

import java.util.Set;
import java.util.HashSet;
import java.util.Objects;

public class Fourth {

	public static void main(String[] args) {
		Student stud = new Student(1,"ABC");
		Student stud2 = new Student(1,"ABC");
		Student stud3 = new Student(1,"ABC");
		Set<Student> set = new HashSet<Student>();
		
		set.add(stud3);
		set.add(stud);
		System.out.println("printing the size....");
		System.out.println(set.size());
	}
}

class Student{
	int id;
	String name;
	
	static int counter = 1;
	
	public Student(int id,String name) {
		this.id = id;
		this.name = name;
		counter++;
	}
	
	public int hashCode() {
		System.out.println("checking the hashcode...");
		return counter++;
	}
	public boolean equals(Objects o) {
		System.out.println("A");
		return true;
	}
}