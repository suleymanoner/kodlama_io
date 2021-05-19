
public class InstructorManager {
	
	public void addInstructor(Instructor instructor) {
		System.out.println("Instructor : " + instructor.getName() + " added!");
	}
	
	public void givingCourse(Instructor instructor) {
		System.out.println("Instructor : " + instructor.getName() + " is giving " + instructor.getWhichCourse() + " course!");
	}

}
