package stm;

import java.util.*;
import java.util.regex.Pattern;
import java.io.*;

public class StudentManager {

	private ArrayList<StudentVo> studentList;
	
	public StudentManager() {
		studentList = new ArrayList<StudentVo>();
	}
	
	public void run() {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("****** 학생관리 프로그램 ******");
		System.out.println("******* ver : 1.0 ********");
		System.out.println("**************************");
		
		while(true) {
			
			System.out.println("-------- 메뉴 --------");
			System.out.println("------ 1. 입력 -------");
			System.out.println("---- 2. 전체 출력 -----");
			System.out.println("--- 3. 상세정보 검색  ---");
			System.out.println("------ 4. 삭제 -------");
			System.out.println("------ 5. 수정 -------");
			System.out.println("--------------------");
			System.out.print("입력 > (종료 = q) ");
			
			String inputValue = scn.nextLine();
			
			if(inputValue.equals("q")) break;
			
			if(inputValue.equals("1")) {
				
				System.out.println("----------");
				System.out.print("이름 입력> ");
				String name = scn.nextLine();
				
				System.out.print("전화번호 입력> ");
				String number = scn.nextLine();
				
				System.out.print("점수 입력> ");
				String tempScore = scn.nextLine();
				
				if(Pattern.matches("[0-9]{1,3}", tempScore)) {
					
					int score = Integer.parseInt(tempScore);
					
					StudentVo student = new StudentVo(name, number, score);
					
					studentList.add(student);
					
					System.out.println("학생정보 임력 완료");
					
				}else {
					System.out.println("숫자를 입력하셔야 됩니다.");
				}
								
				
			}else if(inputValue.equals("2")) {
				//전체
				
				System.out.println("----- 출력 -----");
				for(StudentVo vo : studentList) {
					System.out.println(vo.getName());
					
				}
											
			}else if(inputValue.equals("3")) {
				//검색
				
				System.out.println("----- 검색 -----");
				System.out.print("검색할 이름 입력> ");
				String searchName = scn.nextLine();
				
				int count = 0;
				
				for(StudentVo vo : studentList) {
					
					if(vo.getName().equals(searchName)) {
						System.out.println("이름 : + " + vo.getName());
						System.out.println("번호 : + " + vo.getNumber());
						System.out.println("점수 : + " + vo.getScore());
						
						count++;
					}
				}
				
				if(count <= 0) {
					System.out.println("찾고자하는 학생이 없습니다.");
				}else {
					System.out.println(count + "명이 검색되었습니다.");
				}
				
								
			}else if(inputValue.equals("4")) {
				//삭제
				System.out.println("----- 삭제 -----");
				System.out.print("삭제할 학생의 이름 > ");
				String deleteName = scn.nextLine();
				
				int count = 0;
				
				for(int i = 0 ; i < studentList.size() ; i++) {
					
					StudentVo vo = studentList.get(i);
					
					if(vo.getName().equals(deleteName)) {
						studentList.remove(i);
						i--;
						count++;
					}
					
				}
				
				System.out.println(count + "명이 삭제되었습니다.");
				
				
			}else if(inputValue.equals("5")) {
				//수정
				System.out.println("----- 수정 -----");
				System.out.print("수정할 학생의 이름 > ");
				String searchName = scn.nextLine();
				
				for(StudentVo vo : studentList) {
					if(vo.getName().equals(searchName)) {
						System.out.print("변경할 이름 > ");
						String updateName = scn.nextLine();
						vo.setName(updateName);
						
						System.out.print("변경 할 번호 > ");
						String updateNumber = scn.nextLine();
						vo.setNumber(updateNumber);
						
						System.out.print("변경할 점수 > ");
						String tempScore = scn.nextLine();
						
						vo.setScore(Integer.parseInt(tempScore));
						
						System.out.println("변경이 완료 되었습니다.");		
								
					}
				}
				
				
				
			}else {
				System.out.println("잘못된 번호를 입력하셨습니다.");
			}
			
			System.out.println("계속하시려면 enter를 누르세요.");
			scn.hasNextLine();
			
			
		}
		
		saveFile();
		System.out.println("프로그램을 이용해주셔서 감사합니다.");
		
	}

	private void saveFile() {
		
		File file = new File("C:\\temp\\stm.dat");
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		
		try {
			
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos);
			
			dos.writeByte('S');
			dos.writeByte('T');
			dos.writeByte('M');
			
			dos.writeInt(studentList.size());
			
			for(StudentVo vo : studentList) {
				dos.writeUTF(vo.getName());
				dos.writeUTF(vo.getNumber());
				dos.writeInt(vo.getScore());
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			if(dos != null) {
				try {
					dos.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}
	
	private void loadFile() {
		
		File file = new File("C:\\temp\\stm.dat");
		
		if(!file.exists()) {
			return;
		}
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		
		try {
			
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			
			int s1 = dis.readByte();
			int s2 = dis.readByte();
			int s3 = dis.readByte();
			
			if(s1 != 'S' || s2 != 'T' || s3 !='M') {
				System.out.println("data 파일에 문제가 있습니다.");
				return;
			}
			
			int size = dis.readInt();
			
			for(int i = 0 ; i < size ; i++) {
				String name = dis.readUTF();
				String number = dis.readUTF();
				int score = dis.readInt();
				
				studentList.add(new StudentVo(name, number, score));
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(dis != null) {
				try {
					dis.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
