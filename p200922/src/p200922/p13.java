package p200922;

public class p13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정렬... 버블 소팅..
		int [] arr = {5,1,3,4,7,2,6};
		for(int x=1; x<arr.length; x++) {
			for(int y=0; y<arr.length-x; y++) {
				if(arr[y]>arr[y+1]) {
					int temp=arr[y];
					arr[y]=arr[y+1];
					arr[y+1]=temp;
				}
			}
		}//arr {1, 2, 3...7}
		for(int i=0 ; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
