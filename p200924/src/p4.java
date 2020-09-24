
public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		String b = "트레이서";
		
		Test1 t1 = new Test1(b, a); // (String, int)
		//t1.name = b;
		//t1.score = a; 과 같은 의미
		Test1 t2 = new Test1("한조", 70);
		Test1 t3 = new Test1(); //Test1 t3 = new Test1(); 가 가능하게 하기위해서 오버로딩, 오버라이딩
		Test1 t4 = new Test1("트레이서"); //Test1 t4 = new Test1("트레이서"); 이렇게 만들기 위해 오버로딩 
		
		
	}

}

class Test1{
	String name;
	int score;
	
	Test1(String name, int score)// ()갯수만큼 Main에 생성해줘야 된다.
							{
		System.out.println("1번 생성자 호출됨");
		this.name = name; //.은 접근 this 는 키워드
		this.score = score;
	}
	Test1(String name){
		this.name = name;				//Test1 t4 = new Test1("트레이서"); 이렇게 만들기 위해 오버로딩 
	}
	Test1(){
		System.out.println("2번 생성자 호출됨"); //Test1 t3 = new Test1(); 가 가능하게 하기위해서 오버로딩
	}
	
	
}