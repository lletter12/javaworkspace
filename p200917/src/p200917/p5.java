package p200917;

public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 77;		
		System.out.println(v1);
		
		v1++;
		System.out.println(v1);
		
		++v1; //왠만하면 쓰지 말 코드... 
		System.out.println(v1);
		
		v1 = 10;
		v1++; // v1++ 는 먼저 적용 후에 나머지 연산자 적용시킨다
		int result = 10 + v1;
		//int result = 10 + ++v1; //++v1는 1을 먼저 증가시키고 v1을 사용, v1++은 v1을 사용 후에 1증가 
		System.out.println(v1);
		System.out.println(result);
		
		v1--;
		--v1;
		
		
		
	}

}
