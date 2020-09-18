package p200918;

public class p14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//9~103 사이의 값 중 3의 배수만 더해보자
		
		int sum = 0;
		
		for(int i = 9 ; i <= 103 ; i++) {
			
			
			if(i%3 == 0) {
				sum += i; // sum = sum + i;	
			}
			
		}
		
		
		System.out.println(sum);
		
	}

}
