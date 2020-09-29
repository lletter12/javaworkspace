package d;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person xx = new Firefighter(); //진짜 메모리는 Firefighter 참조변수는 Person
		xx.test(); // 상속을 받는 메소드인 Firefighter에 있는 메소드 'test값'을 불러온다
		
		xx = new Student();
		xx.test();
		
	}

}


class Person {
	public String id; // 주민번호
	public int age;
	public String name;
	
	public void test() {
		System.out.println("Person test!!!");
	}
}

//extends Person > preson을 상속 받아서 값을 가져오다
class Firefighter extends Person {

	public String fNumber; // 소방관 등록번호
	
	public void turnsOff() {
		System.out.println("불을 끕니다.");
	}
	
	//오버라이딩> 하위 클래스에서 메소드를 재정의해서 사용한다.
	public void test() {
		System.out.println("소방관 테스트");
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
	
	//오버라이딩
	public void test() {
		System.out.println("Student test!!");
	}
}

class EarthInvasionForce {
	
}