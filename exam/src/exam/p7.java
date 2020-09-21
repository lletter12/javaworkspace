package exam;

public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for문을 이용해서 1부터 1000까지의 합을 구하는 코드를 작성하되 3의 배수만 더하느 코드를 작성하자.
		
		int sum = 0;
		
		for(int i = 3 ; i <= 1000 ; i+=3) {
			sum += i;
		}
		System.out.println("결과 : " + sum + " 입니다.");
		
		
		
	}

}
