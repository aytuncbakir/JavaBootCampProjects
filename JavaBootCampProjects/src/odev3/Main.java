package odev3;

public class Main {

	public static void main(String[] args) {
		
		
		UserManager userManager = new UserManager();	
	
		System.out.println("Student logging process begin");
		User student  = new Student();
		student.setId(1L);
		student.setFirstName("Ali");
		student.setLastName("Han");
		student.setUserName("ahan");
		student.setPassword("2334322323");
		
		userManager.signUp(student);
		
		System.out.println("\n--------------------------------------------------\n");
	
		System.out.println("Intructor logging process begin");
		
		User instructor = new Instructor();
		instructor.setId(2L);
		instructor.setFirstName("Veli");
		instructor.setLastName("Sel");
		instructor.setUserName("vsel");
		instructor.setPassword("5656565656");
		

		userManager.signUp(instructor);
		
		System.out.println("\n--------------------------------------------------\n");
		System.out.println("Intructor management process begin");
		String[]  homeworks = {"homework1","homework2","homework3","homework4","assessment"};
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.openLectures((Instructor)instructor);
		System.out.println("\n--------------------------------------------------\n");
		instructorManager.listGivenLecture((Instructor)instructor);
		System.out.println("\n--------------------------------------------------\n");
		instructorManager.closeLecture((Instructor)instructor, "Angular");
		System.out.println("\n--------------------------------------------------\n");
		instructorManager.giveHomeWork(homeworks);
		
		
		System.out.println("\n--------------------------------------------------\n");
		System.out.println("Student management process begin");
		StudentManager studentManager = new StudentManager();
		
		System.out.println("\n--------------------------------------------------\n");
		studentManager.addLecture((Student)student, (Instructor)instructor);
		studentManager.listTakenLecture((Student)student);
		System.out.println("\n--------------------------------------------------\n");
		studentManager.removeLecture((Student)student, "Java");
		System.out.println("\n--------------------------------------------------\n");
		studentManager.listTakenLecture((Student)student);
		System.out.println("\n--------------------------------------------------\n");
		studentManager.doHomeWork(homeworks);
		
		
		
		
		
	}

}
