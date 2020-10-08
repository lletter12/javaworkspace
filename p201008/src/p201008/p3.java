package p201008;

import java.util.*;
public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("한조1");
		list.add("한조2");
		list.add("한조3");
		list.add("한조4");
		list.add("한조5");
		
		
		list.add(3, "한조7");
		list.remove(4); //remove는 arraylist가 조금더 나음
		
		/*
		for(int i = 0 ; i < list.size() ; i++) {
			String temp = list.get(i); //get이 많을 때는 ArrayList가 좋다, LinkedList는 get이 최소화되야 한다.
			System.out.println(temp);
		}
		따라서, 반복문을 이렇게 돌리지 않는다 
		*/ 
		
		for(String data : list) {
			System.out.println(data);
		}
		
		
	}

}
