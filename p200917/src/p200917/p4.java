package p200917;

public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//단축 배정 연산자...(대입 연산자의 한 종류)
		
		int var1 = 10;
		System.out.println(var1);		
		//var1 = var1 + 5;
		var1 += 5;
		var1 += 5;
		System.out.println(var1);
		
		var1 -= 3;
		System.out.println(var1);
		
		//var1 *= 3;
		var1 = var1 * 3; //(곱하기는 풀어쓰는 사람이 더많다)
		System.out.println(var1);
		
		var1 /= 10;
		var1 %= 10;
		System.out.println(var1);
		
		var1 = var1 +1;
		System.out.println(var1);
		var1 += 1;
		System.out.println(var1);
		var1++;
		System.out.println(var1);
		
		var1 = var1  -1;
		var1 -= 1;
		var1 --;
		System.out.println(var1);
		
	}

}
