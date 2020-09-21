package exam;

public class p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 863은 소수인가?
		
		int value = 863;
		
		boolean isprime = true;
		
		for(int i = 2 ; i <= Math.sqrt(value) ; i++) {
			if(value%i == 0) {
				isprime = false;
				break;
			}
		}
		if(isprime == true) {	
			System.out.println(value + "는 소수입니다.");
		}else {
			System.out.println(value + "는 소수가 아닙니다.");
		}
		
		
		
	}

}
