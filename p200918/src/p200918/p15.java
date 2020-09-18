package p200918;

public class p15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//9~103의 사이의 값 중 3의 배수만 더해보자.
		
		int hap = 0;
		
		for(int x = 9 ; x <= 103 ; x++) {
			
			if(x%3 != 0) {
				continue;
			}
			
			hap += x; //hap = hap + x
		}
		
		System.out.println(hap);
		
	}

}
