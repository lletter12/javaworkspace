package inheritance;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//상속 - 다형성 - 오버라이딩
		//상속 보다는 인터페이스에 집중
		Parent p = new Parent();
		p.a = 10;
		p.b = 20;
		
		Child c = new Child();
		c.a = 10;
		c.b = 20;
		c.c = 30;
		c.d = 40;
		
		//다형성....
		//Child reff = new Parent(); //성립불가, 상속관계에 있을 때는 강제형변환은 됨
		Parent ref1 = new Child();
		ref1.a = 10;
		ref1.b = 20;
		//ref1.c = 30;
		//ref1.d = 40;
		
		ref1.testMethod();
		//진짜 메소드인 Child가 호출
	}

}

class Parent{
	int a, b;
	
	//오버라이딩 시작..
	void testMethod() {
		System.out.println("Parent test");
	}
}

//Parent를 상속받는다고 선언을 하면 Child는 int c,d 만 생성되는게 아니라 int a,b도 같이 생성된다.
class Child extends Parent{
	int c,d;
	
	@Override //주석달기
	//오버라이딩 시작..
	void testMethod() {
		System.out.println("Child test");
	}
}

