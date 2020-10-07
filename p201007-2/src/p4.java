import java.util.ArrayList;

public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StudentData> list = new ArrayList<StudentData>();
		list.add(new StudentData("한조1", "11", 90));
		list.add(new StudentData("한조2", "11", 90));
		list.add(new StudentData("한조3", "11", 90));
		list.add(new StudentData("한조4", "11", 90));
		list.add(new StudentData("한조5", "11", 90));
		list.add(new StudentData("한조6", "11", 90));
		list.add(new StudentData("한조7", "11", 90));
	
		list.remove(3);
		
		list.add(3, new StudentData("트레이서", "77", 50));
		
		//list.clear();
		
		list.set(4, new StudentData("브리기테", "48", 50));
		
				
		for(int i = 0 ; i < list.size(); i++) {
			StudentData temp = list.get(i);
			System.out.println(temp.name);
		}
		
		
		
	}
	
	

}


class StudentData{
	String name;
	String number;
	int score;
	
	public StudentData(String name, String number, int score) {
		this.name = name;
		this.number = number;
		this.score = score;
	}
	
	
}