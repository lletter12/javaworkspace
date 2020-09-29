package f;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//완전추상화
		//interface - ... 추상의 끝, 아무것도 구현하지 않는다. 상속과 오버라이딩이 무조건 적용되어야 한다. 자바언어에서만 있다.	
		//상속 - 다형성 -오버라이딩 => 결합도를 낮춘 설계를 할 수 있다.
		
		
		AAAA xxx = null;
		// xxx = new AAAA();
		
		xxx = new TestA(); // 다형성 TestA만 들어갈 수 있다.
		
		BBBB xxx1 = new TestA();
		xxx.print(); //오버라이딩된 진짜 print값 출력
		xxx.test(); //오버라이딩된 진짜 test값 출력
		
	}

}

interface BBBB{
	public abstract void process();
}

interface AAAA {
	public abstract void print(); //항상 public abstract 로 시작, 코드를 구현하면 안된다.
	void test(); //문법적으로 빼도 자동적으로 public abstract.
	public void print1();//문법적으로 빼도 자동적으로 public abstract.
}

//TestA는 AAAA,BBBB둘다 상속받는다.
class TestA implements AAAA, BBBB{
	// interface를 상속받기 위해서 implements를 써야한다.
	// abstract를 빼고 public void를 써줘야한다.
	
	public void tttt() {
		//상속받는 거 말고 다른것도 구현할 수 있다.
	}
	
	public void process() {
		
	}
	
	public void print() {
		System.out.println("AAA1");
	}
		
	public void test() {
		System.out.println("AAA2");	
	}
	public void print1() {
		System.out.println("AAA3");
	}
}
