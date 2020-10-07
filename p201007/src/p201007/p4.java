package p201007;

public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentData s1 = new StudentData();
		s1.name = "한조";
		s1.number = "99";
		s1.score = 80;
		
		StudentData s2 = new StudentData();
		s2.name = "트레";
		s2.number = "89";
		s2.score = 80;
		
		if(s1.equals(s2)) {
			System.out.println("두개는 같다.");
		}else {
			System.out.println("두개는 다르다.");
		}
		
	}

}

class StudentData{
	String name;
	String number;
	int score;
	
	public boolean equals(Object xx) {
		
		StudentData target = (StudentData)xx;
		
		if(this.name.equals(target.name)&& this.score == target.score) { 
			return true;
		}
		
		return false;
	}
	
}