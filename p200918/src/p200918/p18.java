package p200918;

public class p18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100의 합을 구해보자
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}

		System.out.println(sum);

		// 구구단을 출력해보자

		for (int a = 2; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				int hap = a * b;
				System.out.println(a + "X" + b + "=" + hap);
			}

		}

	}

}
