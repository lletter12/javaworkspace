package exam;

public class p11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1+(-2)+3+(-4)+... 과 같은 식으로 계쏙 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
			
		/*
		int sum = 0;
		int n = 1;
		int x = 0;
		
		for(int i = 1 ; sum<100 ; i++) {
			x = i*n;
			n = -n;
			sum += x;
		}
			System.out.println(x);
		*/
		
		
		/*
		int sum = 0; 
		int s = 1;
		int num = 1;
		
		for(int i = 1 ; true ; i++, s=-s) {
			num = i*s; 
			sum += num;
			if(sum >= 100) {
				break;
			}
		}
		System.out.println("num =" + num);
		System.out.println("sum =" + sum);
		*/
		
			
		int sum = 0;
		for(int x = 1 ; true ; x++) //for문 안쪽에 있는 값은 for문이 끝나면 소멸
											{
			
			if(x%2 != 0) {
				sum += x; //sum = sum + x;
			}else {
				sum -= x; //sum = sum - x;
			}	
			if(sum >= 100) {
				System.out.println(x);
				break;
			}
		}
		
		
	}

}
