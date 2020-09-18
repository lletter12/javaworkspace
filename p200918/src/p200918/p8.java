package p200918;

public class p8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 7;
		
		
		//== equal....
		switch(value) /*switch는 값, 문자열, 등이 들어갈수 있다.*/ {
		case 1: 
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		case 4:
			System.out.println("4입니다.");
			break;
		default:
			System.out.println("그 이외의 값입니다.");
		} /*value값이 4이면 4로 점프해서 실행, value값이 2이면 2으로 점프해서 2,3,4 실행 그래서 break 코드를 걸어주어야 한다.*/
		
		
		
	}

}
