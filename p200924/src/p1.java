
public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Week week = Week.MON;
		
		
		if(week == Week.MON) {
			System.out.println("월요일 입니다.");
		}else if(week == Week.TUE) {
			System.out.println("화요일 입니다.");
		}else if(week == Week.WED) {
			System.out.println("화요일 입니다.");
		}
		
		
	}

}

enum Week{
	MON,
	TUE,
	WED,
	THU,
	FRI,
	SAT,
	SUN,
}
