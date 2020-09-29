package e;

public class p1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestC xx = new TestC();
		
		A a = new A();
		a.setX(xx);
		a.run();
		
		
	}	
}
class A {
	
	private ProcessAble x; 
	
	public void setX(ProcessAble x) { 
		this.x = x;
	}
	
	public void run() {
		x.process();
	}
	
}

interface ProcessAble {
	public abstract void process();
}



class TestB implements ProcessAble {
	public void process() {
		//코드 ...
	}
}

class TestC implements ProcessAble {
	public void process() {
		//코드 ...
	}	
		
}
