package p200922;

public class p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		* 30  0  0  0
		*  0  0 70  0
		*  0  0 80  0
		*/
		
		int [][] arr = new int [3][4];
		
		arr[0][0] = 30;
		arr[1][2] = 70;
		arr[2][2] = 80;
		
		for(int x = 0 ; x < 3 ; x++) {
			for (int y = 0 ; y < 4 ; y++) {
				System.out.println(arr [x][y]);
			}
		}
		
		
		
		
	}

}
