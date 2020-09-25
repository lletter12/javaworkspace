
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Temp를 한번만 생성 그 이루헤는 생성하고 싶지 않다.
		
		Temp xx2 = Temp.getInstance();
		Temp xx1 = Temp.getInstance(); //2번 생성 한다. 그래서 private static으로 생성
		//외부에서는 생성하지 못하지만 내부에서 생성할 걸 사용가능
		xx2.process1();
	}

}

class Temp{
	
	private Temp(){
		
	} //private는 외부에서는 건들 수 없지만 내부에서는 1번 생성할 수 있다.
	  //메소드 만들기
	private static final Temp instance = new Temp(); //static을 주지 않으면 한개도 만들지 못한다.	
	public static Temp getInstance() {
		return instance;
		//Temp xxx = new Temp(); //내부에서 생성
		//return xxx; 
	}
	
	//속성
	//...
	//기능
	//...
	public void process1() {
		System.out.println("~~~~~~~");
	}
	
}





