package p200922;

public class p14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2부터 100사이의 값 중 소수를 구해보자...
		//에라토스테네스의 체...
		
		int [] arr = new int[99];
		for(int x = 2; x <= 100; x++) {
			arr[x-2] = x;
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] != -1) {
				System.out.println(arr[i] + "는 소수입니다.");
				
				for(int x= i+1; x<arr.length; x++) {
					if(arr[x]%arr[i]==0) {
						arr[x] = -1;
					}
				}
			}
		}
		
	}

}
