package p200917;

public class p13 {

	private static final int IS_MAN = 1; //0000 0001 상수정의
	private static final int IS_STUDENT = 2; //0000 0010 상수정의
	private static final int HAS_CAR = 4; //0000 0100 상수정의
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isMan = false;
		boolean isStudent = true;
		boolean hasCar = false;
		//.... 8가지 ....
		
		//0000 0001 = man = 1
		//0000 0010 = student = 2
		//0000 0100 = Car = 4
		
		//0000 0000
		byte data = 0;
		
		//0000 0000 = data
		//0000 0010 = 2
		
		//0000 0010 <- data 
		data = (byte)(data | IS_STUDENT); //데이터 입력...
		
		//0000 0010 data
		//0000 0001 IS_MAN
		
		//0000 0010 data
		data = (byte)(data | IS_MAN); //남자..
		
		//???? ????
		//0000 0010
		
		//0000 00?0
		if((data & IS_STUDENT) == IS_STUDENT) {
			System.out.println("학생 입니다.");
		}else {
			System.out.println("학생 아닙니다.");
		}
		
		
	}

}
