
public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Command xxx = new TestA();
		
		xxx.method();
		
	}

}

interface Command{
	public abstract void method();
}

class TestA implements Command{
	public void method() {
		//...
	}
}

class TestB implements Command{
	public void method() {
		//...
	}
}
