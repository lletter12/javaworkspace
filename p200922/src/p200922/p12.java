package p200922;

public class p12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 arr을 정렬하세요(정렬)
		int [] arr = {1,3,2,7,6,5,4};
		
		//수행코드.....(선택정렬)
		for(int i=0; i < arr.length; i++) {
			for(int j=i+1 ; j< arr.length ; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
		
		
		
		/*
		int temp = 0;
		
		for(int i = 0; i < arr.length ; i++) {
			for(int j = 0; j < arr.length-1 ; j++) {	
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] 
				}
			}
			System.out.println(arr[i]);
		*/	
			
		
		
	}

}
