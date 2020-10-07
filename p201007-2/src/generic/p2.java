package generic;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student<String,String> s1 = new Student<String,String>();
		Student<String,Integer> s2 = new Student<String,Integer>();
		Student<System,Math> s3 = new Student<System,Math>();
		
	}

}

class Student<T,V>{
	String name;
	T number;
	V score;
}






