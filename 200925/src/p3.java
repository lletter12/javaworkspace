
public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3.a = 10;
		
		System.out.println(Test3.a); // static은 Test로 접근
		
		Test3.a = 20;
		System.out.println(Test3.a); // static은 메모리 생성하지 않아도 1개 생성해도 1개
	}

}

class Test3{
	static int a; 
}


