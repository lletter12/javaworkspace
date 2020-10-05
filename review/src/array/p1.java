package array;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] arr;
		//arr = null; // 문법적으로 참조변수를 확인하는 방법은 null값을 넣어보면 문법성립
		//arr = new int[10];
		
		int [] arr = new int [10];
		String [] arr1 = new String [10]; // 타입이 같아야 한다.
		
		arr[0] = 11; //쓰기 모드
		System.out.println(arr[0]); //읽기 모드
		
		//
		Test1 [] arr2 = new Test1[10]; //Test1에 해당하는 주소값이 10개 생성
		arr2[0] = null;
		
		Test1 xx = new Test1(); // 위에와 완전 다른코드, 위에 코드는 참조변수 배열 생성, 밑에는 인스턴스 생성
		xx.a = 10;
		xx.b = 20;
		
		arr2[0] = xx;
		arr2[1] = new Test1();
		arr2[2] = new Test1();
		
		arr2[2].a = 10;
		arr2[2].b = 30;
		
		
	}

}

class Test1{
	int a;
	int b;
}

