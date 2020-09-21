package exam;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for문을 이용해서 1부터 76까지의 합을 구하는 코드를 작성하자.
		
		int sum = 0;
		
		for(int i=1 ; i <= 76 ; i++) {
			sum += i;
		}
		
		System.out.println("1부터 76까지의 합 : " + sum);
	}

}
