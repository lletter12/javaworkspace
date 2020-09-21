package exam;

public class p12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1+(-2)+3+(-4)+... 과 같은 식으로 계쏙 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
		
		int sum = 0;
		int n = -1;
		
		
		for(int x = 1; true ; x++) {
			
			n = n * -1;
			
			sum = sum + (x*n);
			
			if(sum >= 100) {
				System.out.println(x);
				break;
			}
		}
				
	}

}
