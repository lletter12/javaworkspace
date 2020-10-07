package p201007;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.name = "한조";
		s1.number = "27";
		s1.score = 99;
		
		System.out.println(s1);
		
		Student s2 = new Student();
		s2.name = "트레이서";
		s2.number = "77";
		s2.score = 80;
		
		System.out.println(s2);
		
	}

}

class Student{
	String name;
	String number;
	int score;
	
	public String toString() {
		
		String print = "name : " + this.name + ", number : " + this.number;
		
		return print;
	}
	
}