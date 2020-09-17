package p200917;

public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//비교 연산자...(!!!중요)
		int a = 1;
		
		boolean r = a < 10; //비교연산자 타입은 boolean 
		System.out.println(r);
		
		r = a > 10;
		System.out.println(r);
		
		a = 10;
		r = a >= 10;
		System.out.println(r);
		
		r =a <= 10;
		System.out.println(r);
		
		a=11;
		
		r = a == 10; // == 왼쪽과 두개를 비교해서 같으면 true 틀리면 false
		System.out.println(r);
		
		r= a != 10; //a != a가 10과 같지 않은지 를 물어봄
		System.out.println(r);
		
		
		
	}

}
