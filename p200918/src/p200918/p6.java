package p200918;

public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		
		
		
		int score1 = 93;
		
		if(score1>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		if(score1< 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		// if(score1< 90) System.out.println("점수가 90보다 작습니다."); 출력이 1개면 {}생략가능
		
		
	}

}
