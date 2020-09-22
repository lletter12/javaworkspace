package p200922;

public class p11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 arr 내에서 가장 큰 수를 출력하세요.
		int [] arr = {5,7,1,3,4,6,2};
		
		int tempMax = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] > tempMax) {
				tempMax = arr[i];
			}
		}
		System.out.println(tempMax);
		
		
		
		
	}

}
