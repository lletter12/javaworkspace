package p200922;

public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열의 생성
		System.out.println("안녕하세요");
		int [] xxx = new int [10]; //int 값을 담을 메모리 10개 생성
		
		xxx[0] = 10; //[]안에는 정수만
		xxx[1] = 20;
		xxx[2] = 70;
		xxx[3] = 80;
		xxx[4] = 30;
		xxx[5] = 70; 
		
		
		System.out.println(xxx[2]);
		
		for(int i = 0 ; i < xxx.length ; i++) {
			System.out.println(xxx[i]);
		}
		
		
	}

}
