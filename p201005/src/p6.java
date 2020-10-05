
public class p6 {
	public static void main(String[] args) {
		BB xx = new BB();
		System.out.println(xx.a);
		xx.printData();
	}

}
class AA{
	int a = 10;
}

class BB extends AA{
	int a = 20; //정신나가지 않는이상 안만듬, 문법적으로만 허용
	
	public BB() {
		super(); // 상속에 있는 생성자를 호출하고 나머지 코드를 실행해라
	}
	
	public void printData() {
		System.out.println(this.a);
		System.out.println(super.a); //suuper는 상위
	}
	
	
	
}