package exam;

public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단 7단을 출력해보자

		int a = 7;

		for (int b = 1; b <= 9; b++) {
			int sum = a * b;
			System.out.println(a + "X" + b + "=" + sum);
		}
		// 구구단을 출력해보자
		// 구구단을 출력하되 7단과 6단을 제외하고 출력하자.

		/*
		 * for(int a=2 ; a<=9 ; a++) { if(a%6!=0 && a%7!=0) System.out.println(a);
		 * for(int b=1 ; b<=9 ; b++) { int g = a*b; System.out.println(a + "X" + b
		 * +"="+g);
		 * 
		 * 
		 * } }
		 */

		for (int x = 2; x <= 9; x++) {
			if (x == 7 || x == 6) {
				continue;
			}

			for (int y = 1; y <= 9; y++) {
				int result = x * y;
				System.out.println(x + "X" + y + "=" + result);
			}
		}

	}

}
