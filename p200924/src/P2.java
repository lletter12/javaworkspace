
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String name1 = "한조";
		String number1 = "010222";
		int score1 = 70;
		
		String name2 = "트레";
		String number2 = "01021231";
		int score2 = 80;
		*/
		
		StudentData st1 = new StudentData(); //----메모리 생성, 참조변수 st1은 4byte stack메모리에 생성
		st1.name = "트레이서";				// st1. -> 접근연산자 / name, ph, score는 heap메모리에 생성
		st1.phoneNumber = "0100154";
		st1.scroe = 70;
		
		StudentData st2 = new StudentData(); //하나 생성 될때마다 인스턴스 생성, 메모리 생성
		st2.name = "한조";
		st2.phoneNumber = "0101115";
		st2.scroe = 80;
		
		st1=null;
		st1.name ="메르시";
		
		System.out.println(st2.name);
		System.out.println(st1.name);
		
	}

}


class StudentData{
	//속성 - 멤버 변수
	String name;
	String phoneNumber;
	int scroe;            //----메모리 생성 필요
	
	
	//기능 - 
	
}





