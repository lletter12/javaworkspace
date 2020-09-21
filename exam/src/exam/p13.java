package exam;

public class p13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.

		// #1
		int sum = 0;
		int sum1 = 0;

		for (int x = 1; x <= 10; x++) {
			sum += x;
			sum1 += sum;
		}
		System.out.println(sum1);

		// #2
		int a = 0;

		for (int b = 1; b <= 10; b++) {
			for (int c = 1; c <= b; c++) {
				a = a + c;
			}
		}
		System.out.println(a);

		// #3
		int total = 0;
		
		for (int y = 1; y <= 10; y++) {
			total = total + ((11 - y) * y);
		}
		System.out.println(total);
		
		// #4
		int sum3 = 0;
		
		for(int z = 1 ; z <= 10 ; z++) {
			sum3 = sum3 + (z*(z+1)/2);
		}
		System.out.println(sum3);
		
		
	}

}



