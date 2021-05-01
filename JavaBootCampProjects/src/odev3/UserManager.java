package odev3;

public class UserManager {
	
	public void logIn(User user) {
		System.out.println(user.getUserName() + " logged in");
	}
	
	public void signUp(User user) {
		
		addUser(user);
		logIn(user);
		
	}
	
	public void addUser(User user) {
		System.out.println(user.getUserName() + " added");
	}
	
	
	

}
