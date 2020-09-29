package f;


public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person [] arr = new Person[5];
		
		Person xxx = null; //참조변수는 가능
		//new Person(); //익스턴스는 불가능
		
		arr[0] = new Firefighter();
		arr[1] = new Firefighter();
		arr[2] = new PoliceOfficer();
		arr[3] = new PoliceOfficer();
		arr[4] = new Student();
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i].work();
		}
		
	}

}

//abstract 추상적인 class, Person이라는 추상적인 class, 애를 상속받는 class를 정의하기 위해서 만든 class, 상속용도의 class, 설계의 밑바탕 class
//단 참조변순는 만들 수 있다.
abstract class Person {
	public String id; // 주민번호
	public int age;
	public String name;
	
	public void test() {
		System.out.println("Person test!!!");
	}
	//기능 추상화 void 앞에 abstract를 붙혀서 기능을 추상화, Person을 상속받는 모든 class는 work 메소드가 생성되어있어서 오버라이딩되어있어야 한다.
	//오버라이딩하지 않으면 신택스에러 발생
	public abstract void work();
}

//extends Person > preson을 상속 받아서 값을 가져오다
class Firefighter extends Person {

	public String fNumber; // 소방관 등록번호
	
	public void work() {
		System.out.println("불을 끕니다.");
	}
}

class PoliceOfficer extends Person {

	public String pNumber; // 경찰관 번호
	
	public void work() {
		System.out.println("범인을 잡는다.");
	}
}

class Student extends Person {
		
	public String sNumber;
	
	public void work() {
		System.out.println("공부를 한다.");
	}
	
	public void escape() {
		System.out.println("도망친다.");
	}
}

class EarthInvasionForce {
	
}