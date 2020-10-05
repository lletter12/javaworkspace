package Conditional;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//조건문 if, if ~ else, if ~ else if .. ~ else
		//switch ~ case
		
		//반복문 : for, while, do-while
		
		//문제 : 1 ~ 100 사이의 정수 중 홀수의 합만 구해보세요.
		int sum = 0;
		for(int x = 1 ; x <= 100 ; x++) {
			if(x%2 != 0) {
				sum += x;	
			}
		}
		
		System.out.println(sum);
		
		
	}

}
