package p201008;

import java.util.*;

public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("한조", "1111");
		map.put("트레", "1111");
		map.put("트레", "7777"); //1111을 수정
		map.put("브리기테", "8888");
		
		String pw = map.get("한조");
		System.out.println(pw);
		
		//null 값을 return 해준다.
		pw = map.get("없는 애");
		System.out.println(pw);
		
		Set<String> keySet = map.keySet();
		
		for(String key : keySet) {
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
	}

}
