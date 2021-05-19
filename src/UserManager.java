
public class UserManager {
	
	public void addUser(User user) {
		System.out.println("User : " + user.getName() + " added!");
	}
	
	public void deleteUser(User user) {
		System.out.println(user.getName() + " deleted in system!");
	}
	
}
