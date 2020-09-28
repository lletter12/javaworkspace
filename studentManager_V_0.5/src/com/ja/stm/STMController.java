package com.ja.stm;
import java.util.*;
//사용자하고 밀접한 클래스 UI 담당
//Presentation Layer

public class STMController {

	private Scanner scn; 
	private STMModel model;
	
	public STMController() { 
		this.model = new STMModel();
		this.scn = new Scanner(System.in);
	}
	
	public void run() {
		//사실상 시작점...
		
		
		this.showInfo();
		
		while(true) {
			
			this.showMenu();
			String inputValue = this.scn.nextLine();
			
			if(inputValue.equals("q")) {
				break;
			}
			
			switch(inputValue) {
			case "1":
				this.addStudent();
				break;
			case "2":
				this.showStudentList();
				break;
			case "3":
				this.searchStudent();
				break;
			case "4":
				this.deleteStudent();
				break;
			case "5":
				this.updateStudent();
				break;
			default:
				System.out.println("잘못된 값을 입력하셨습니다.");
			} //switch는 같냐 아니냐만 비교할 수 있어서 if문보다 범위가 좁다.
			
			System.out.println("계속하시려면 enter를 입력하세요.");
			this.scn.nextLine();
		}
		
		this.goodBye();
		
	}
	
	private void showInfo() {
		System.out.println("*******************");
		System.out.println("*   학생 관리 프로그램    *");
		System.out.println("*     ver : 0.5   *");
		System.out.println("* 최종 업테이트 : 9-28 *");
		System.out.println("*******************");
	}
	
	private void showMenu( ) {
		System.out.println("======= 메뉴 ========");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 리스트 출력");
		System.out.println("3. 학생 검색(상세정보)");
		System.out.println("4. 학생 정보 삭제");
		System.out.println("5. 학생 정보 수정");
		System.out.print("입력 (종료=q) > ");
	}
	
	private void goodBye() {
		System.out.println("프로그램을 종료합니다.");
		System.out.println("사용해주셔서 감사합니다.");
	}
	
	private void addStudent() {
		//입력
		System.out.println("====학생 정보 입력====");
		
		System.out.print("학생 이름 입력 > ");
		String name = this.scn.nextLine();
		
		System.out.print("전화번호 입력 > ");
		String phoneNumber = this.scn.nextLine();
		
		System.out.print("점수 입력 > ");
		String temp = this.scn.nextLine();
		int score = Integer.parseInt(temp);
		
		this.model.add(name, phoneNumber, score);
	}
	
	private void showStudentList() {
		//학생 리스트 출력
		StudentVo [] arr = this.model.getStudentList();
		//arr[0] = null;
		//arr[0].setName("aaa"); << 현재 이게 문제...
		
		
		for(int i = 0 ; i < this.model.getStudentCount() ; i++) {
			StudentVo vo = arr[i];
			
			System.out.println(i + " : " + vo.getName());
		}
	}
	
	private void searchStudent() {
		//정보 검색
		System.out.println("==== 학생 정보 검색 ====");
		System.out.println("검색할 학생의 이름을 입력하세요.");
		System.out.print("입력 > ");
		String searchName = this.scn.nextLine();
		
		StudentVo studentVo = this.model.getStudentByName(searchName);
		
		if(studentVo == null) { 
			System.out.println("검색 결과가 없습니다.");
		}else {
			System.out.println("이름  : " + studentVo.getName());
			System.out.println("전화번호  : " + studentVo.getPhoneNumber());
			System.out.println("점수 : " + studentVo.getScore());
		}
		
	}
	
	private void deleteStudent() {
		//학생 정보 삭제
		System.out.println("===== 삭제 =====");
		System.out.println("삭제할 학생의 이름을 입력해 주세요.");
		System.out.print("입력 > ");
		String deleteName = this.scn.nextLine();
		
		int deleteCount = this.model.deleteByName(deleteName);
		
		System.out.println(deleteCount + "명이 삭제 되었습니다.");
		
	}
	
	private void updateStudent() {
		//학생 정보 수정
		System.out.println("===== 학생 정보 수정 =====");
		System.out.println("수정할 학생의 이름을 입력해 주세요.");
		System.out.print("입력 > ");
		String updateName = this.scn.nextLine();
		
		StudentVo studentVo = this.model.getStudentByName(updateName);
		
		if(studentVo != null) {
			System.out.println("변경내용 없을 시 enter를 입력하세요.");
			System.out.println("변경할 이름을 입력하세요.");
			System.out.print("입력 > ");
			String changeName = this.scn.nextLine();
			
			System.out.println("변경할 번호를 입력하세요.");
			System.out.print("입력 > ");
			String changPhoneNumber = this.scn.nextLine();
			
			System.out.println("변경할 점수를 입력하세요.");
			System.out.print("입력 > ");
			String tempScore = this.scn.nextLine();
			int changeScore = 0;
			if(tempScore.equals("")) {
				changeScore = -1;
			}else {
				changeScore = Integer.parseInt(tempScore);
			}
			
			this.model.updateByName(updateName, changeName, changPhoneNumber, changeScore);
			
		}else {
			System.out.println("입력하신 학생은 존재하지 않습니다.");
			System.out.println("처음부터 다시 시작해주세요.");
		}
		
		
	}
	
}
