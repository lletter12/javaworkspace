
public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 x1 = new Test2();
		Test2 x2 = new Test2();
		
		x1.a = 10;
		x2.a = 20;
		
		System.out.println(x1.a);
		System.out.println(x2.a);
		
		x1.c = 30; //허용은 되나 쓰면 안되는 코드 / static int c
		x2.c = 40;
		
		System.out.println(x1.c);
		System.out.println(x2.c);
		
	}

}

class Test2{
	int a; 
	int b;
	static int c; //static 어떤 메모리가 있는데 스택과 힙메모리가 아닌 메소드메모리에 4바이트로 생성
	              //new에 영향을 받지 않는다. 딱 한개 생성된다 따라서 전역변수(고정된)를 생성하는 코드
	
	
}
