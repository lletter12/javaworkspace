
public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new Test1(); //class Test1dml int v1,c2 / String v3 생성
		
		t1.v1 = 10; //....
		
		t1.process1();
		
		//......
		int x = 20;
		int y = 30;
		int result = t1.plus(x, y);
		System.out.println(result);
		
	}

}

// class와 Main에서 변수는 따로 스택으로 쌓여서 변수명이 같아도 충돌이 일어나지않는다
class Test1{
	int v1;
	int v2;
	String v3;
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	void process1() {
		System.out.println("AAAA");
	}
	
	void process2() {
		System.out.println("BBBB");
	}
	
	
}