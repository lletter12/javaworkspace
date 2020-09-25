
public class p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data x = new Data(); //메모리는 그대로 생성가능
		x.setName("한조"); //내부에서 만들어서 외부에서 출력가능
		
		
	}

}

//VO(Value Object), DTO(Data Transfer Object)

class Data{
	// private은 외부에서 접근 불가능 그러므로 메소드를 만들어줘야 한다. (게터 ,세터)
	private String name;
	private String number;
	private int score;
	
	public void setName(String name) {
		this.name = name; //세터 명명법 set+대문자
	}
	
	public String getName() {
		return this.name; //게터 게터는 return필요
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return this.score;
	}
	
}

