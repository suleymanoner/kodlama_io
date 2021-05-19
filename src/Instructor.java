
public class Instructor extends User{

	private String whichCourse;
	
	public Instructor(int id, String name, String surname, String whichCourse) {
		super(id,name,surname);
		this.whichCourse = whichCourse;
	}

	public String getWhichCourse() {
		return whichCourse;
	}

	public void setWhichCourse(String whichCourse) {
		this.whichCourse = whichCourse;
	}
	
	
	
}
