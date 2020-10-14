package p3;

public class StudentVo {
	private String name;
	private String number;
	private int score;
	
	public StudentVo(String name, String number, int score) {
		super();
		this.name = name;
		this.number = number;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
