package exam;

public class p10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2부터 100사이의 소수를 구해보자.
		for(int value = 2; value <= 100 ; value++) {
			
			boolean isprime = true;
			
			for(int i = 2 ; i <= Math.sqrt(value) ; i++) {
				if(value%i == 0) {
					isprime = false;
					break;
				}
			}
			if(isprime == true) {	
				System.out.println(value + "는 소수입니다.");
			}

		}
		
				
	}

}
