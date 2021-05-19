
public class StudentManager {
	
	public void addStudent(Student student) {
		System.out.println("Student : " + student.getName() + " added!");
	}
	
	public void takenCourse(Student student) {
		System.out.println("Student : " + student.getName() + " is taking " + student.getTakenCourse() + " course!");
	}

}
