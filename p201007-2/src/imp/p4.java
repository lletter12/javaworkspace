package imp;

public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//람다식....
		CommandTTT xxx = (a,b)->{
			System.out.println(a);
			System.out.println(b);
			System.out.println("안녕하세요");
		};
		
		//여기있는 코드가 실행되면 람다식 코드가 실행된다
		xxx.process(10, 20);
		
	}

}

interface CommandTTT{
	
	public abstract void process(int a, int b);
	
}
