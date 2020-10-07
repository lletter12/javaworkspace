package p201007;

public class p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 t1 = new Test3();
		t1.a = 10;
		t1.b = 20;
		
		Test3 c = t1.getTest3();
		
		System.out.println(c.a);
	}

}

class Test3 implements Cloneable{
	int a;
	int b;
	
	public Test3 getTest3() {
		
		Test3 result = null;
		try {
			result = (Test3)this.clone();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
		
		
	}
	
}