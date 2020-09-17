package p200917;

public class p10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 논리 , 논리 합 &&, ||
		
		
		//논리 곱	= 양쪽 다 true에만 true / 나머지는 false
		// And
		// .....이고 ....인 경우 ...(둘다 만족해야 true)
		boolean r = true && true; // 입력값과 출력값 모두 true와 false만 가능, 양쪽 다 true인 경우만 true, 조건 && 조건 -> true
		System.out.println(r);
		
		int value = 16;
		
		if(value > 10 && value%2!=0) {
			System.out.println("조건 만족");
		}
		
		System.out.println("코드 끝.");
		
		//논리 합 || 한쪽이라도 true면 true....
		// OR
		// .... 이거나 .... 인 경우....
		
		r = true || false;
		
		//활용.....
		//장학금을 받을 조건....
		
		int score = 30; //학점
		int attend = 0; //출석 점수
		int bongsa = 100; //봉사 활동 점수...
		
		//if(score >= 90 && attend >= 80 || bongsa == 100)
		if((bongsa == 100 || score >= 90) && attend >=80 )
		{
			System.out.println("장학금 받을 수 있어요.");
		}
		
	}

}
