package exam;

public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 200까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오.
		
		int sum = 0;
		
		for(int i = 1; i <= 200; i++) {
			
			if(i%2 != 0 && i%3 != 0) {
				sum += i; //sum = sum +i;	
			}
		}
		
		System.out.println("결과 : " + sum + " 입니다.");
		
	}

}
