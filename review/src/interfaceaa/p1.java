package interfaceaa;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인터페이스는 상속 다형성 오버라이딩의 집합체
		//인터페이스는 표준을 정의한다...
		
		// Command cc = new Command(); // 인터페이스는 추상 클래스이기 때문에 생성불가
		Command cc = new SomeClass1();
		
		cc.process();
		cc.process();
		             
		//모듈 교체
		cc = new SomeClass2();
		
		cc.process();
		cc.process(); 
		
	}

}

//인터페이스 핵심은 메소드, abstract때문에 구현을 하지는 않는다.
interface Command{
	public abstract void process();
	public abstract int test();
}

class SomeClass1 implements Command{

	public void process() {
		System.out.println("SomeClass1 process");
	}

	public int test() {
		
		return 1;
	}
	
}

class SomeClass2 implements Command{
	public void process() {
		System.out.println("SomeClass2 process");
	}
	
	public int test() {
		
		return 0;
	}
}
