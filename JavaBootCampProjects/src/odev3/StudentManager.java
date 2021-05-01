package odev3;

public class StudentManager extends UserManager{
	
	public void addLecture(Student student, Instructor instructor) {
		
		System.out.println("Lectures have been added");
		String[] lectures = {instructor.getGivenLectures()[0],
				instructor.getGivenLectures()[1],
				instructor.getGivenLectures()[3],
				instructor.getGivenLectures()[4] };
		
		student.setTakenLectures(lectures);
		
	}
	
	public void listTakenLecture(Student student) {
		
			
			System.out.println("List of Taken Lectures :");
			for(String lecture : student.getTakenLectures() ) {
				
				if(lecture.equals("removed"))
					System.err.println(lecture);
				else
					System.out.println(lecture);
				
			}
			
	}
	
	public void removeLecture( Student student,String removeLecture) {
		
		System.out.println("Lecture has been removed");
		String[] lectures = student.getTakenLectures();
		for(int i = 0 ; i<lectures.length; i++ ) {
			if(lectures[i].equals(removeLecture)) {
				lectures[i] = "removed";
			}
		}
		student.setTakenLectures(lectures);
		
		listTakenLecture(student);
	}
	

	public void doHomeWork(String[] homeworks) {
		
		
		for(String homework : homeworks) {
			System.out.println("# "+homework + " has been done");
			
		}
	}
}
