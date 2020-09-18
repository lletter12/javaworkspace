package p200918;

public class p16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//9~103 사이의 값 중 3의 배수만 더해보자
		
		int sum = 0;
		
		for(int x = 9 ; x <=103 ; x = x + 3) {
			sum += x;
		}
		
		System.out.println("합 : " + sum + "입니다.");
		
	}

}
