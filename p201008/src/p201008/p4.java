package p201008;

import java.util.*;
public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		int count = 0;	
		
		while(true) {
				
			int value = (int)(Math.random()*46) + 1;
			System.out.println("랜덤 값  : " + value);
			
			if(set.add(value)) {
				count++;
				if(count >= 6) {
					break;
				}
			}
						
		}
		
		for(int x : set) {
			System.out.println("뽑힌 값" + x);
		}
		
		if(set.contains(11)) {
			System.out.println("11이 존재합니다.");
		}
		
	}

}
