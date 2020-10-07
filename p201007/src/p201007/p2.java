package p201007;

import java.util.*;
public class p2 {

	public static void main(String[] args) {
		Date xxx = new Date();
		
		System.out.println(xxx);
		
		Test2 t1 = new Test2();
		System.out.println(t1);
	
		String t2 = t1.toString();
		System.out.println(t2);
		
	}
}

class Test2{
	
	public String toString() {
		
		String str = "안녕하세요";
		
		return str;
	}
		
}