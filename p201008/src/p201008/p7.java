package p201008;

import java.util.TreeSet;

public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set = new TreeSet<Integer>();
		int count = 0;
		

		
		while(true) {
			int value = (int)(Math.random()*45);
			
			if(set.add(value)) {
				count++;
				if(count >= 6) {
					break;
				}
				
			}
		}
		
		for(int x : set){
			
			System.out.print(x + ",");
		}
		
	}

}
