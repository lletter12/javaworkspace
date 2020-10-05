package valuable;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수의 선언....
		
		int varName = 10;
		
		System.out.println(varName);
		
		//기본 타입 변수
		//byte v1 = 1;
		//short v2 = 1;
		int v3 = 1;
		//long v4 = 1;
		float v5 = 1.5F;
		double v6 = 1.5;
		char v7 = '안';
		boolean v8 = false;
		
		//모든 변수 - stack에 쌓이고, 스코프 ()를 빠져나가면 메모리가 소멸된다.
		
		//참조 타입
		Test1 v9 = null; // 순수한 값은 못들어가고 null값만, 변수이기 때문에 둘다 stack에 쌓이고 스코프를 빠져나가면 메모리가 소멸된다.
		v9 = new Test1(); // 타입이 다르면 문법오류
		//System.out.println(v9);		
		
		String str1 = null;
		String str2 = new String("안녕하세요");
		String str3 = "안녕하세요"; //사실은 문법적으로 꺠져있다. 어딘가에 메모리를 생성하고 주소값을 넣어주는 구조
		
		//int xx = 10;
		int xx;
		xx = 10;
		
		//int bb = int cc;
		int bb = 10;
		int cc = 20;
		bb = cc;
		
		
		
	}
 
}


class Test1{
	//속성
	//기능
}