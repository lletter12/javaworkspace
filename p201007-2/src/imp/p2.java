package imp;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//익명 객체 생성...
		
		Command x = new Command() {
			public void test() {
				System.out.println("XXXXXXX");
			}
		};
		
		x.test();
	}

}
