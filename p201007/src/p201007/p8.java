package p201007;

public class p8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SomeClass x1 = new SomeClass();
		x1.a = 10;
		x1.b = 20;
		x1.ref = new Data();
		x1.ref.c = 10;
		
		
		SomeClass x2 = new SomeClass();
		x2.a = x1.a;
		x2.b = x1.b;
		//x2.ref = x1.ref;
		x2.ref = new Data();
		x2.ref.c = x1.ref.c;
		
		
		System.out.println(x1.a);
		System.out.println(x2.a);
	}

}

class SomeClass{
	int a; 
	int b;
	Data ref;
	
}

class Data{
	int c;
	int d;
}
