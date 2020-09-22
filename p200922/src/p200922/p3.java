package p200922;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String("안녕하세요"); //new는 새로운 heap 메모리 생성. 새로운 stack 메모리 생성
		String b = new String("안녕하세요");
		
		System.out.println(a);
		System.out.println(b);
		
		if(a.equals(b)) //문자열 비교할때는 .equals() 사용
						{
			System.out.println("둘은 같다.");
		}else {
			System.out.println("둘은 다르다.");
		}
		
	}

}
