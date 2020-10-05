package oop;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//클래스 선언법 (속성, 셍성자 , 기능)
		//인스턴스 생성법  => new 를 이용해서 생성한다.
		//메소드 선언 및 호출 문법
		
		
		XXXX x = new XXXX(10, 20); //접근할 주소x가 있어야지만 사용할 수 있다.  
		//x.a = 10;
		//x.b = 20;
		XXXX x2 = new XXXX(); 
		//x2.a = 30; private로 출력불가능
		x2.setA(30); //보조를 통해서 값을 설정해야 함.
		System.out.println(x.getA()); //설정된 값을 호출
		
		//x2.b = 40;
		
		
		//System.out.println(x.a); private로 출력불가능
		
		x2.printData(); // 생성자와 다르게 호출을 아무때나 할 수 있다.
		
		x2.printData();
		
		int result = x2.innerPlus();
		System.out.println(result);
	}

}

class XXXX{
	private int a,b;
	public XXXX(){
		
	}
	//XXXX 두개다 가능하게 된다
	//생성자 생성, 외부에서의 초기값 또는 내부에서의 초기값
	public XXXX(int a, int b){
		this.a = a;
		this.b = b;// 값을 정해준다.
	}
	
	//메소드 리턴타입과 명 꼭 지정, 메소드는 호출하는 지점을 잡을 수 있따.
	public void printData() {
		System.out.println("printData a : " + this.a);
		System.out.println("printData b : " + this.b);
	}
	
	//void가 아닌 리턴타입에서는 return을 꼭 선언해줘야 한다.
	public int innerPlus() {
		int result = this.a + this.b;
		return result;
	}
	
	public int getA() {
		return this.a;
	}
	
	//setter는 리턴이 필요없으니 void로 선언해야 하고 값을 넣어줘야 한다
	public void setA(int a) {
		this.a = a;
	}
	
}

