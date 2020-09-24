
public class p3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentData1 b = new StudentData1();
		StudentData1 c = new StudentData1();
		StudentData1 d = new StudentData1();
		//StudentData1 e = null; / 변수는 값이 있어야 사용가능
		//System.out.println(e);
		
		String name = "트레이서";
		String phoneNumber = "010666";
		int score = 80;
		
		StudentData1 a = new StudentData1();
		a.name = name ;
		a.phonenumber = phoneNumber;
		a.score = score;
		
		b.name = "한조";
		b.phonenumber = "010551";
		b.score = 80;
		
		
		System.out.println(a.score);
	
		StudentData1 eee = new StudentData1();
	} //Main 코드 실행 후 class 안에 있는 코드 실행 후에 다시 위로 올라옴
}

class StudentData1 {
	//속성 ... 아무것도 넣지 않으면 초기화 값
	String name; // = "한조"; 									//메모리를 생성하자마자 "한조"생성
	String phonenumber;
	int score;
	
	//생성자... 클래스명 그대로 적어야 되고, (), {}. 자동으로 인스턴스 한번 입력
	//생성자... 무언가의 값을 초기화 시키기 위해서 자주 쓰임.
	/*
	StudentData1() {
	//실행되는 코드
	System.out.println("안녕하세요");
	int a = 10;
	int b = 20;
	int result = a+b;
	System.out.println(result + "반가워요");
		
		
	}*/
	StudentData1() {
		name = "한조";								    	//실행될때 "한조"생성/ 일반적으로 생성자에 ""생성
		score = 70; //하늘색은 멤버변수 heap메모리
		//int aaaa = 10; //aaaa는 stack메모리
			
	}
	
}