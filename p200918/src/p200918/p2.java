package p200918;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = (int)(Math.random()*50) + 50; /*(Math.random()*무작위)[0.1~0.99*무작위 숫자 - 범위] + 1[시작점]*/
		System.out.println(value);
		
		if(value >= 90) {
			System.out.println("A입니다.");
		}else {
			if(value >= 80) {
				System.out.println("B입니다.");
			}else {
				System.out.println("F입니다.");
			}
		}
			
			
		
		
		
		
	}

}
