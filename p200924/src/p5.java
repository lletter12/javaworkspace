
public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Car c1 = new Car("빨강");
		Car c2 = new Car("파랑");
		
		c1.upSpeed(10); //메소드를 호출하는 문법				/ 해당 문법이 실행되면 메소드 문법 실행
		c1.upSpeed(); 									//(x)값이 있는 메소드 호출, ()없으면 없는 default메소드 호출 
		c1.upSpeed(30); 
		c1.upSpeed(40); 
		c1.downSpeed(); 
		
		c2.upSpeed(20); 
		c2.upSpeed(30); 
		c2.downSpeed();
		
		//System.out.println(c1.speed);
		//System.out.println(c2.speed);
		c1.run();
		c2.run();
		System.out.println("끝");
		
	}

}

class Car{
	//속성 - 멤버 변수
	String color;
	int speed;
	
	//생성자
	Car(String color){
		this.color = color;
		//this.speed = 0;
	}
	
	//기능 - 메소드
	//리턴타입 메소드이름(){}
	
	void upSpeed( ) {
		this.speed += 30;
	}
	
	void upSpeed(int x) 										// 메소드 문법 실행 후에 다시 Main으로 되돌아감(return)
					{
		this.speed += x; //메소드는 자기 자신의 메모리가 꼭 필요함 this는 c1, c2(주체에 따라) speed를 따로 실행시킨다.
		
	} // void upSpeed()와 void upSpeed(x)는 이름만 같을 뿐 별개의 메소드다!!
	
	void downSpeed() {
		this.speed -= 30;
	}
	void run( ) {
		System.out.println(this.color + "차가 " + this.speed + "km로 이동합니다.");
	}
}



