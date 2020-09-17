package p200917;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 산술 연산자....
		
		int a = 10;
		int b = 20;
		int r = a + b;
		System.out.println(r);
		
		r = a - b; 	//int를 쓰면 안되는 이유 '변수 r을 계속 사용하기 위해서'/r의 결과를 도출 후 필요없을때 다시 변수 생성 
		System.out.println(r);
		
		r = a * 5;  
		System.out.println(r);
		
		r = a / b; // 피연산자 중에서 둘다 int형이면 나누기는 정수나누기를 한다. 소수점이 안나옴
		System.out.println(r);
		
		//실수 나누기를 하려면... 둘중 하나라도 실수이면 실수 나누기 실행
		double rr = a / (double)b; // =가 충돌
		System.out.println(rr);
		
		// r = (int)(a / (double)b);
		// System.out.println(r);
		
		double bb = b;
		
		
		rr = a / bb;
		System.out.println(rr);
		
		a = 6;
		b = 2;
		
		
		r = a / b;
		System.out.println(r);
		
		r = a % 7; //나머지 연산자.... 배수이냐 아니냐를 선별할때 
		System.out.println(r);
		
		//부호 연산자(단항 연산자)
		a = -7;
		a = -a;
		a = -a;
		a = +a;
		System.out.println(a);
		
		//대입 연산자...
		a = 10;
		System.out.println(a);
		
		a = a + b;
		
		int v1= 10;
		int v2= 20;
		int v3= v1 + v2;
		System.out.println(v3);
		
		v3 = v3 + 10; //..!!중요
		v3 += 10; //위 코드와 동일...
		
		
		
		System.out.println(v3);
	}

}
