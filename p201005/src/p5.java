
public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test4 xx = new Test4();
		//xx. / .뒤에 나오는 메소드는 클래스를 정의하지 않아도 Object라는 클래스를 상속받는다
		Object xx = new Test4();
		Object str = "안녕하세요";
		
		Object [] arr = new Object[10];
		arr [0] = "안녕하세요";
		arr [1] = 1;
		arr [2] = false;
		arr [3] = new Test1();
		arr [3] = new Test4();
		
		Test4 ttt = new Test4();
		Test4 ttt2 = new Test4(10);
		
	}

}

class Test4{
	private int a;
	
	public Test4() {
		//this(10); //다른생성자를 호출해라 (int값을 받는 Test4를 호출하라)
		this.a = 10;
		System.out.println("aaa");
	}
	
	public Test4(int a) {
		this.a = a;
	}
	
}

class Test5 extends Test4{
	
}
