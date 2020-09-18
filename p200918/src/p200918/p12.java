package p200918;

public class p12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for.... 고전적 for / 향상된 for
		
		/*
		for(초기식 ; 조건식 ; 증감식) 초기식->조건식->코드실행->증감식->조건식->코드실행, '증감->조건->코드 반복' {
			// .... 코드들 ....
			// .... 코드들 ....
		}
			
		*/
		
		for(int i = 1 ; i <= 10 ; i++)  {
			
			if(i%2 == 0) {
				continue;
			}
			
			System.out.println(i);
			
			if(i == 7) {
				break;
			}
			
		}
		
		
	}

}
