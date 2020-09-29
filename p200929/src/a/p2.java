package a;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//상속 - 다형성 - 오버라이딩
		//상속
		
		Firefighter f1  = new Firefighter();  //상속된 person값도 같이 생성된다.
		Firefighter f2  = new Firefighter();
		f1.turnsOff();
		f1.name = "한조";
		f1.age = 10;
		f1.id = "1111";
		f1.test();
		//f1.xxx = 10;
		
		PoliceOfficer p1 = new PoliceOfficer();
		PoliceOfficer p2 = new PoliceOfficer();
		p1.catchTheCriminal();
		p1.test();
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		s1.study();
		s1.test();
	}
}

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