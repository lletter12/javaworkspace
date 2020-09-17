package p200917;

public class p12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//비트.... 연산자...
		
		
		//0000 0000 0000 0000 0000 0000 0000 0001
		int a = 1;
		
		int result = a << 3; // <<위에 비트를 3번 민다는 소리 -> 0000 0000 0000 0000 0000 0000 0000 1000
		System.out.println(result);
		
		//0000 0000 0000 0000 0000 0000 0000 0111
		a = 7;
		result = a >> 1; // //0000 0000 0000 0000 0000 0000 0000 0011 1(마지막 1 은 소멸)
		System.out.println(result);
		
		// 1111 1111 1111 1111 1111 1111 1111 1111 1111
		a = -1;
		result = a >> 1;
		// 1111 1111 1111 1111 1111 1111 1111 1111 1111
		// 1111 1111 1111 1111 1111 1111 1111 1111 1111 1 (앞에가 1이면 1로 채워서 오른쪽으로 민다)
		System.out.println(result);
		
		a = -1;
		result = a >>> 1;
		// 1111 1111 1111 1111 1111 1111 1111 1111 1111
		// 0111 1111 1111 1111 1111 1111 1111 1111 1111 1
		System.out.println(result);
		
		
		
	}

}
