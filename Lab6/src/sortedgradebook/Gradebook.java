package sortedgradebook;

public class Gradebook {
	private String fst, snd;
	private int scr;
	public void add(String firstName, String lastName, int score)
	
	{fst = firstName;
	snd = lastName;
	scr = score;
	
	}
	public String getFst() {
		return fst;
		
	}
	public String getSnd() {
		return snd;
	}
	public int getScr() {
		return scr;
	}
	public void setFst(String firstName) {
		fst = firstName;
	}
	public void setSnd(String lastName) {
		snd = lastName;
	}
	public void setScr(int score) {
		scr = score;
	}

}
