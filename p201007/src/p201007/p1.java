package p201007;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//모든 클래스는 Object를 상속 받는다.
		//다형성이 적용된다.
		
		Object xx = new Test1();
		
		Object [] arr = new Object [100];
		
		arr[0] = new Test1();
		arr[0] = new String();
		
		
	}

}

class Test1{
	//...
	int a;
}
