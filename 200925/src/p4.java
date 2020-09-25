
public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//int a = 20;
		MyCommonsMemory.value = 20; //static 메모리는 언제 어디서든 접근가능하다. 메모리는 끝까지 소멸안한다
									//메모리 소멸이 안되서 효율성이 떨어지므로 적절하게 사용하여야한다.
		
		Test4.print();
		
	}

}

class Test4{
	
	static void print() {
		System.out.println(MyCommonsMemory.value);
	}
}

class MyCommonsMemory{
	static int value = 0;
	
	
}

