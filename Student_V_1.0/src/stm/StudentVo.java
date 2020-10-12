package stm;

public class StudentVo {
	private String name;
	private String number;
	private int score;

	public StudentVo(String name, String number, int score) {
		this.name = name;
		this.number = number;
		this.score = score;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getNumber() {
		return this.number;
	}
	
	public int getScore() {
		return this.score;
	}
	
	
}