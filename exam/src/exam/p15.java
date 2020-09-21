package exam;

public class p15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10000 사이에 8이 몇번 나오는가?
		int count = 0;
		for (int i = 1 ; i <= 10000 ; i++) {
			
			int temp = i;
			
			while(temp != 0) { 
				//8887
				if(temp%10 ==8) {
					count++;
				}
				temp = temp / 10;
			}
		
		}	
		System.out.println(count);
	}
}