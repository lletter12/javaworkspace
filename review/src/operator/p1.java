package operator;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//연산자
		//산술연산자 +, -, *, /, %
		//증감 연산자 ++, --
		
		//단축 배정 연산자...
		int a = 10;
		
		a = a + 20;
		a += 20;
		
		//문자열 연산
		String str1 = "안녕하세요" + 111 + 222 + "반갑습니다";
		//String str2 = "안녕하세요" - 111;
		System.out.println(str1);
		str1 = str1 + "QQ";
		str1 += "QQ";
		
		//연산자 우선순위... ()
		String str2 = "안녕하세요" + (111 + 222) + "반갑습니다";
		System.out.println(str2);
		
		//비교 연산자 == , != , >, <, >=, <=
		//결과는 boolean타입
		
		int aa = 10;
		int bb = 20;
		
		boolean cc = aa == bb;
		
		//논리 연산자 &&, ||, !(단항연산자)
		//결과는 boolean
		boolean dd = aa > 10 && bb < 10; //aa와 bb값이 boolean이어야 문법이 성립한다.
		
		boolean ee = !(aa <= 10); //일반적으로 not(!)을 쓸때는 우선순위를 올려줘야 한다.
		
		
		Test1 xxx1 = new Test1();
		Test1 xxx2 = new Test1();
		//Test1 xxx3 = xxx1 + xxx2; 자바에서는 안됨
		
	}

}

class Test1 {
	//속성
	//기능
}


