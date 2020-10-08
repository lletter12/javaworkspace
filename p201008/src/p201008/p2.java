package p201008;

import java.util.*;
public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();

		list.add("한조1");
		list.add("한조2");
		list.add("한조3");
		list.add("한조4");
		list.add("한조5");
		
		//삭제와 추가가 많으면 ArrayList 쓰는걸 고민해봐야한다.
		list.remove(3); //고민..
		list.add(2, "한조6"); //고민
		
		if(list.contains("한조7")) { //애매하다..
			System.out.println("존재한다!");
		}else {
			System.out.println("존재하지 않는다!");
		}
		
		list.set(0, "한조8");
		
		
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		
		
	}

}
