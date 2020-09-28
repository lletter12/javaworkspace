package com.ja.stm;

//순수 데이터 처리
//Business Layer
//[], . >> 참조변수에 접근하는 접근연산자
public class STMModel {

	private StudentVo [] studentArray;
	private int count;
	
	public STMModel() {
		this.studentArray = new StudentVo[10];
		this.count = 0;
	}
	
	public int getStudentCount() {
		return this.count;
	}
	
	public void add(String name, String phoneNumber, int score) {
		
		StudentVo studentVo = new StudentVo(name, phoneNumber, score);
		this.studentArray[this.count] = studentVo;
		this.count++;
		
	}
	
	public StudentVo [] getStudentList() {
		
		StudentVo [] tempArray = new StudentVo[this.count];
		
		for(int i = 0 ; i < this.count ; i++) {
			tempArray[i] = this.studentArray[i];
		}
		
		return tempArray;
	}
	
	public StudentVo getStudentByName(String searchName) {
		
		for(int i = 0 ; i < this.count ; i++) {
			
			StudentVo studentVo = this.studentArray[i];
			
			if(studentVo.getName().equals(searchName)) {
				return studentVo;
			}
			
		}
		
		return null;
		
	}
	
	public int deleteByName(String deleteName) {
		
		int deleteCount = 0;
		
		for(int i = 0 ; i < this.count ; i++) {
			
			StudentVo studentVo = this.studentArray[i];
			
			if(studentVo.getName().equals(deleteName)) {
				for(int x = i ; x < this.count - 1 ; x++) {
					this.studentArray[x] = this.studentArray[x+1];
				}
				i--;
				this.count--;
				deleteCount++;
			}
			
		}
		return deleteCount;
	}
	
	public void updateByName(String targetName , String changeName, String changePhoneNumber, int changeScore) {
		
		for(int i = 0 ; i <this.count ; i++) {
			StudentVo studentVo = this.studentArray[i];
			
			if(studentVo.getName().equals(targetName)) {
				
				if(!changeName.equals("")) {
					studentVo.setName(changeName);
				}
				if(!changePhoneNumber.equals("")){
					studentVo.setPhoneNumber(changePhoneNumber);
				}
				if(changeScore >= 0) {
					studentVo.setScore(changeScore);
				}
			}
		}
		
	}
	
}
