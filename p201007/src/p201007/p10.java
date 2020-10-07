package p201007;

import java.util.ArrayList;

public class p10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TTT v1 = new TTT();
		v1.a = 10;
		v1.b = 20;
		
		TTT v2 = (TTT)v1.clone();
		TTT v3 = (TTT)v1.clone();
		TTT v4 = (TTT)v1.clone();
		TTT v5 = (TTT)v1.clone();
		TTT v6 = (TTT)v1.clone();
		
		ArrayList<Integer> list = null;
		
		ArrayList<Integer> list2 = (ArrayList<Integer>)list.clone();
		
		
	}

}

class TTT implements Cloneable{
	int a;
	int b;
	
	public Object clone() {
		
		Object temp = null;
		try {
			temp = super.clone();
		}catch(Exception e) {
			e.printStackTrace();
		}
				
		return temp;
	}
	
	
}
