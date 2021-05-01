package odev3;

public class InstructorManager extends UserManager{

	public void openLectures(Instructor instructor) {
		
		String[] lectures = {"C#","Java","Angular","React","JavaScript","Node.js","SQL"};
		instructor.setGivenLectures(lectures);
	}
	
	public void listGivenLecture(Instructor instructor) {
	
		
		System.out.println("List of Given Lectures :");
		for(String lecture : instructor.getGivenLectures() ) {
			
			if(lecture.equals("closed"))
				System.err.println(lecture);
			else
				System.out.println(lecture);
			
		}
		
	}
	
	public void closeLecture( Instructor instructor,String closeLecture) {
		System.out.println("Lecture has been closed");
		String[] lectures = instructor.getGivenLectures();
		for(int i = 0 ; i<lectures.length; i++ ) {
			if(lectures[i].equals(closeLecture)) {
				lectures[i] = "closed";
			}
		}
		instructor.setGivenLectures(lectures);
		listGivenLecture(instructor);
	}
	
	public void giveHomeWork(String[] homeworks) {
		
		System.out.println("Homoworks has been given");
	
		for(String homework : homeworks) {
			System.out.println("* "+homework);
			
		}
	}
}
