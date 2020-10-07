package p201007;

public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1111111");
		{
		AA xx = new AA();
		}
		System.out.println("2222222");
		
		int sum = 0;
		for(int i = 0 ; i <= 100000; i++) {
			sum += i;
		}
		
	}

}

class AA{
	
	AA(){
		System.out.println("AA 생성자 호출");
	}
	
	public void finalize() {
		System.out.println("AA 소멸자 호출");
	}
	
}

