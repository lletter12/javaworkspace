import java.util.*;

public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, StudentData> map =
				new HashMap<String, StudentData>();
		
		map.put("1번", new StudentData("한조1", "1", 99));
		map.put("2번", new StudentData("한조2", "1", 99));
		map.put("3번", new StudentData("한조3", "1", 99));
		map.put("4번", new StudentData("한조4", "1", 99));
		map.put("5번", new StudentData("한조5", "1", 99));
		
		
		StudentData temp =  map.get("2번");
		System.out.println(temp.name);
		
	}

}
