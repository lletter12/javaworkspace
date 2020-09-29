package c;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Firefighter [] arr1 = new Firefighter[10];
		//PoliceOfficer [] arr2 = new PoliceOfficer[10];
		//Student [] arr3 = new Student[10];
		
		//test
		Person xx = new Firefighter();
		//Firefighter qq = new Person(); //안됨 하지만 강제력을 부여해서 가능하게 할 수 있음 타임퀘스트
		//Firefighter qq = (Firefighter)new Person(); //문법적으로는 가능
		//qq.fNumber = "xxx"; //person에는 fNumber를 생성할 수 없다. 메모리가 생성될 수 없다. 컴파일되서 실행은 되지만 익셉셥발생
		//test
		
		Person [] arr1 = new Person[10]; // 한꺼번에 반복문을 돌리고 싶을때 다형성을 이용, 하나의 배열로 관리가 가능해진다
		
		arr1[0] = new Firefighter();
		arr1[1] = new Firefighter();
		arr1[2] = new Firefighter();
		
		arr1[3] = new PoliceOfficer();
		arr1[4] = new PoliceOfficer();
		arr1[5] = new PoliceOfficer();
		arr1[6] = new PoliceOfficer();
		
		arr1[7] = new Student();
		arr1[8] = new Student();
		arr1[9] = new Student();
		
		for(int i = 0 ; i <arr1.length ; i++) {
			//System.out.println(arr1[i].age);
			//arr1[i].test();
			
			
			//instanceof 연산자는 arr1[i]의 메모리가 Firefighter인지 확인해서 true false인지 확인
			if(arr1[i] instanceof Firefighter) {

				Firefighter temp = (Firefighter)arr1[i]; //arr은 문법적으로는 person, 강제적으로 가능
				temp.turnsOff();
					
			}
					
		}
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