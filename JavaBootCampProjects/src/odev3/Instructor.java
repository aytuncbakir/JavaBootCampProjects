package odev3;

public class Instructor extends User{

	private String[] givenLectures;

	public Instructor() {
	}

	public Instructor(String[] givenLectures) {
		super();
		this.givenLectures = givenLectures;
	}

	public String[] getGivenLectures() {
		return givenLectures;
	}

	public void setGivenLectures(String[] givenLectures) {
		this.givenLectures = givenLectures;
	}

	
}
