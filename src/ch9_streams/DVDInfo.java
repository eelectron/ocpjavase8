package ch9_streams;

public class DVDInfo {
	String title;
	String genre;
	String leadActor;
	
	DVDInfo(String t, String g, String a){
		title = t;
		genre = g;
		leadActor = a;
	}
	
	public String toString() {
		return title + " / " + genre + " / " + leadActor;
	}
}