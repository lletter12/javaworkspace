package com.ja.stm;

//value object (데이터 형태 묶는 클래스)

public class StudentVo {
	private String name;
	private String phoneNumber;
	private int score;
	
	public StudentVo() {}
	
	public StudentVo(String name, String phoneNumber, int score) { 
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.score = score;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getName() {
		return this.name;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public int getScore() {
		return this.score;
	}
}
