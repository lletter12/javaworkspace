package exam;

public class p14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int left = 1;
		int right = 1;
		int next = left + right;
		
		for(int i = 1 ; i <= 10 ; i++) {
			next = left + right;
			left = right;
			right = next;
			
		}

		System.out.println(right);
		}
		
		
		
	}


