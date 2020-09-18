package p200918;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = (int) (Math.random() * 100); // 0~99까지 랜덤
		System.out.println("value 값: " + value);

		System.out.println("실행되는 코드들...");
		System.out.println("실행되는 코드들...");
		System.out.println("실행되는 코드들...");

		// if(value >= 25 && value <= 75)/*||(or)를 적용시키면 하나라도 만족해서(항상 true) else가 작동하지않는다. 조건을 변경해야한다*/
		// if(value < 25 || value > 75)
		if (value >= 25 && value <= 75) {
			// 실행될 코드들...
			System.out.println("정상 수치입니다. 25~75 사이입니다.");
		} else {
			System.out.println("문제가 있습니다.");
		}

		System.out.println("입력 받은 값이 50보다 작습니다.");

		System.out.println("실행되는 코드들...");
		System.out.println("실행되는 코드들...");

	}

}
