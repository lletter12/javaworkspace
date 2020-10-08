package p201008;

import java.util.*;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("한조");
		list.add("트레이서");
		list.add("디바");
		list.add("메르시");
		
		for(int i = 0 ; i < list.size() ; i++) {
			String temp = list.get(i);
			System.out.println(temp);
		}
				
	}

}
