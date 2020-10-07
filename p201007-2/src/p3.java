import java.util.*;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String v1 = "한조";
		String v2 = "트레이서";
		String v3 = "브리기테";
		
		String [] arr = new String[3];
		arr[0] = v1;
		arr[1] = v2;
		arr[2] = v3;
		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add(v1);
		list.add(v2);
		list.add(v3);
		
		String value = list.get(0);
		System.out.println(value);
		
		list.remove(1);
		
		for(int i = 0 ; i < list.size() ; i++) {
			String temp = list.get(i);
			System.out.println(temp);
		}
		
	}

}
