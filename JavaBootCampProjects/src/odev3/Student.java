package odev3;

public class Student extends User{
	
	private String[] takenLectures;  // 

	public Student() {
		
	}
	
	public Student(String[] takenLectures) {
		super();
		this.takenLectures = takenLectures;
	}

	public String[] getTakenLectures() {
		return takenLectures;
	}

	public void setTakenLectures(String[] takenLectures) {
		this.takenLectures = takenLectures;
	}
	
	
	
	

}
