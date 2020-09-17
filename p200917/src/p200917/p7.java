package p200917;

public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//연산자 우선 순위...(신경쓸 일 없음... 자연스럽게 익숙해지게 됨)
		
		int a = 10;
		int r = (a + 5) * 3;
		
		System.out.println(r);
		
		r = a + (3 * 4) + 5; //사칙연산을 알아도 가독성을 위해서()사용
		System.out.println(r);
		
		r = ((a + 4) * 3) / 5;
		System.out.println(r);
	}

}
