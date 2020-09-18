package p200918;

public class p17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//구구단 출력해보자
		
		// 2 X 1 = 2
		// 2 X 2 = 4
		// 2 X 3 = 6
		// ....
		// 2 X 9 = 18
		// 3 X 1 = 3
		// 3 X 2 = 6
		// ....
		// 3 X 9 = 27

		for (int a = 2 ; a <= 9 ; a++) {
			for(int b = 1 ; b <= 9 ; b++) {
				
				int result = a * b;
				
				System.out.println(a + " X " + b +" = " + result);
			}	
		}
		
	}
}
