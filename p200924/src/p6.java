
public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mycalc tt= new Mycalc();
		//int xx = tt.plus(10, 20); //return 타입에 맞게 타입을 정해줘야 한다.
		int xx = tt.plus(1000, 20); // xx 값은 -1
		System.out.println(xx);
	}

}

class Mycalc{
	
	int plus(int a, int b) {
		
		if(a > 100) {
			return -1;
		}
		
		int result = a + b;
		//System.out.println(result);
		return result; //return할려면 return 타입을 정해줘야 한다. result를 return해주는게 아니라 "값"을 return해준다.
						//일반적으로 return은 끝에 위치한다.
	}
	
}


