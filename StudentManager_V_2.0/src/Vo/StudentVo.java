package Vo;

public class StudentVo {
	private String name;
	private String sex;
	private String area;
	private int score;
	
	public StudentVo(String name, String sex, String area, int score) {
		super();
		this.name = name;
		this.sex = sex;
		this.area = area;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}
