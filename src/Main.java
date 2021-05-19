
public class Main {

	public static void main(String[] args) {
		
		
		Student student = new Student(1,"Suleyman", "Oner","Java");
		Student student2 = new Student(2,"Alihan", "Akcam","Java");
		
		Instructor instructor = new Instructor(1, "Engin", "Demiroğ", "Java");
		
		UserManager userManager = new UserManager();
		
		User[] users = {
				student,
				student2
		};
		
		userManager.addUser(student);
		userManager.addUser(student2);
		userManager.addUser(instructor);
		
		System.out.println("---------------------");
		
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.addInstructor(instructor);
		instructorManager.givingCourse(instructor);
		
		System.out.println("---------------------");
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.addStudent(student);
		studentManager.addStudent(student2);
		studentManager.takenCourse(student);
		studentManager.takenCourse(student2);
		

	}

}
