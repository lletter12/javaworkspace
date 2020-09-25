
public class p8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//접근 제한자.... public dafault protected private
		Test xx = new Test();
		xx.a = 10;
		xx.b = 20;
		xx.c = 30;
		// xx.d = 40; /private
	
		test.Test xx2 = new test.Test();
		xx2.a = 10;
		//xx2.b = 20;
		//xx2.c = 30;
		//xx2.d = 40;
	}	
}

class Test{
	public int a;
	protected int b;
	int c;
	private int d; //private 문법적인 접근을 막겠다.
	
	
	public void print1() {
		System.out.println("dddd");
	}
	
	private void print2() {
		System.out.println("xxxx");
	}
	
}


