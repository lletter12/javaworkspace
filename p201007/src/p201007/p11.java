package p201007;

public class p11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//람다식.... = 인터페이스구현
		//조건1. 인터페이스 내에 메수드가 1개일것
		Command x = new Test7();
		x.test();
	}

}

interface Command{
	public abstract void test();
}

class Test7 implements Command{
	public void test() {
		System.out.println("야호");
	}
}
