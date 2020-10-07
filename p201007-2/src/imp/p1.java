package imp;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//가장 정상적이고 확실해야되는
		
		Command x = new TestCommand();
		
		x.test();
	}

}

class TestCommand implements Command{
	public void test() {
		System.out.println("!!!!!!!!");
	}
}





