package p200918;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = (int)(Math.random()*50) + 50;
		System.out.println(value);
		
		if(value >= 90) {
			System.out.println("A");
		}else if(value >= 80) {
			System.out.println("B");
		}else if(value >= 70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
		
		
		
	}

}
