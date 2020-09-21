package exam;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 ~ 100까지의 합을 구해보자.
		
		int sum = 0;
		
		for(int i=1 ; i <= 10 ; i++) {
			
			if(i%3 == 0) {
				//System.out.println(i);
				sum = sum + i; //sum += i;
			}
			
		}
		
		System.out.println("1~100까지의 합 : " + sum);
		
		
		
	}

}
