package p200917;

public class p8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열 연산.... !!!!
		
		String str1 = "안녕하세요";
		String str2 = "반갑습니다";
		String r = str1 + " " + str2;
		System.out.println(r);
		
		int a = 10;
		
		r = str1 + a;
		System.out.println(r);
		
		//r = str1 + a + 30; // str1 + a -> +30 (산술 연산이 아닌 문자 연산)
		//r = str1 + a * 30; // 곱하기인 산술연산이 먼저 발생 후에 문자연산
		r = str1 + (a + 30); //()산수 연산 후 문자 연산
		System.out.println(r);
		
		
		System.out.println("a의 값 :" + a);
		
		for(int x = 2 ; x <= 9 ; x++) {
			
			for(int y = 1 ; y <=9 ; y++) {
				int result = x*y;
				
				System.out.println(x + "X" + y + "=" + result);
			}
			
		}
		
		
		//r = str1 - a;
		
		
		
	}

}






