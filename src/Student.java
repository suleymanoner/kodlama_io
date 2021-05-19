
public class Student extends User{
	
	private String takenCourse;
	
	public Student(int id, String name, String surname, String takenCourse) {
		super(id,name,surname);
		this.takenCourse = takenCourse;
	}

	public String getTakenCourse() {
		return takenCourse;
	}

	public void setTakenCourse(String takenCourse) {
		this.takenCourse = takenCourse;
	}
	
	
}
