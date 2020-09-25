
public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 3333.3333;
		
		
		final int a = 10; // final은 변수를 제한함. 딱 한번만 값을 넣겠다. 코드상에서 변경이 안됨.
		//따라서  a = 20; 다른 변수값을 넣을 수 없다. 문법적으로 제한을 한다.
		
		Calc c1 = new Calc();
		c1.color = "빨강";
		
		Calc c2 = new Calc();
		c2.color = "파랑";
		
		//Calc.PI_DATA = 20; 사용불가 final
		int aa=10;
		double result = aa * Calc.PI_DATA;
		
		System.out.println(Math.E);
		System.out.println(Math.PI);
				
		
	}

}

class Calc{
	String color;
	final static double PI_DATA = 3.14; //다른 사람이 변수를 바꾸지 못하게 하기위해 final사용. 상수
								// 상수의 명명법은 대문자로 두개 이상 이름일 떄는"_"(언더바) 사용.
	//여러 기능...
}

