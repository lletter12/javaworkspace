package generic;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data<Integer> x1 = new Data<Integer>();
		x1.value = 10;
		Data<Boolean> x2 = new Data<Boolean>();
		x2.value = true;
		
		
	}

}

class Data<T>{
	T value;
}

class Data1{
	double value;
}

class Data2{
	boolean value;
}