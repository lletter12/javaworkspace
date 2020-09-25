
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//클래스 설계 원칙
		//1.캡슐화 - 정보의 은닉 public, private
		//2.응집도는 높이고 결합도는 낮춘다.
		Account a1 = new Account("한조");
		Account a2 = new Account("트레이서");
		
		a1.deposit(10000);
		a1.withdraw(3000);
		a1.withdraw(15000);
		
		a1.printInfo();
		
		String name = a1.getOwnerName();
		
		
		
	}

}

class Account{
	//속성 /일반적으로 만들때 속성은 private를 쓴다
	private int balance; //절대적으로 노출되서는 안되는 코드
	private final String owner;
	private final int accountNumber;
	
	//생성자
	public Account(String owner) {
		balance = 0;
		this.owner = owner;
		accountNumber = this.createAccountNumber();
	}
	
	//기능
	//1.입금 2.출급 3.잔액정보
	private int createAccountNumber() {
		int result = (int)(Math.random()*10000);
		return result;
	}
	
	public void withdraw(int value) {
		if(this.balance >= value) {
			this.balance -= value;
		}else {
			System.out.println("잔액이 부족합니다.");
			this.balance = 0;
			
		}
	}
	
	public void deposit(int value) {
		this.balance += value;
	}
	
	public void printInfo() {
		System.out.println("-------" + this.owner + "-------");
		System.out.println("계좌번호" + this.accountNumber);
		System.out.println("잔액 : " + this.balance);
	}
	
	public String getOwnerName() {
		return this.owner;
	}
}




