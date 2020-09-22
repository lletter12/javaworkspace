package p200922;

public class p17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {9,9,1,2,3,4,5,6,7,8,};
		
		/*
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		*/
		
		for(int x : arr) //자료구조 안에 있는 갯수만큼 반복
							{
			System.out.println(x);
		}
		
		
	}

}
