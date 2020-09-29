package b;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//다형성 
		//double a = 10; 자동 형변환
		
		//heap메모리로만 생성해서는 아무것도 할 수 없다. 그래서 참조변수 a를 생성
		Firefighter a = new Firefighter(); // String a = new Firefighter; X , PoliceOfficer = new FireFighter; X
		Person b = new Firefighter(); // 다형성 > 상속받는 개체의 상위는 참조변수의 타입으로 설정 할 수 있다. 메모리의 구조는 같다
					
		Person p = new Firefighter(); // 자동형변환
		Firefighter f = new Firefighter();
		
		f.age = 10;
		f.fNumber = "안녕하세요";
		p.age = 10;
		//p.fNumber = "qqq"; // p가 가르키는 fNumber 메모리는 있다. 신택스가 가리키는 메모리는 존재. 문법적으로는 참조변수를 따른다.
							//메모리는 같다. 문법은 참조변수를 따른다. 다형성을 이용하면 메모리를 더 적게 쓴다.
		
		//Student s = new Student();
		Person s = new Student(); // 문법적으로는 가능하지만 쓸수 있는 기능에 제한을 둔다. 메모리의 구조는 바뀌지 않는다. 
		
		//PoliceOfficer police = new PoliceOfficer();
		Person police = new PoliceOfficer();
		//police.catchTheCriminal(); // 메모리는 같지만 다형성으로 자동형번환해서 기능에 제한을 둔다. 따라서 기능을 쓰려면 Person을 PoliceOfficer 로 바꿔야한다.
		
		
		
	}

}

// 문법적으로는 참조변수를 따른다.
class Person {
	public String id; // 주민번호
	public int age;
	public String name;
	
	public void test() {
		System.out.println("test!!!");
	}
}

//extends Person > preson을 상속 받아서 값을 가져오다
class Firefighter extends Person {

	public String fNumber; // 소방관 등록번호
	
	public void turnsOff() {
		System.out.println("불을 끕니다.");
	}
}

class PoliceOfficer extends Person {

	public String pNumber; // 경찰관 번호
	
	public void catchTheCriminal() {
		System.out.println("범인을 잡는다.");
	}
}

class Student extends Person {
		
	public String sNumber;
	
	public void study() {
		System.out.println("공부를 한다.");
	}
}

class EarthInvasionForce {
	
}