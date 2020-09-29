package starcraft;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit [] arr = new Unit[6];
		
		arr[0] = new SCV();
		arr[1] = new Marine();
		arr[2] = new Marine();
		arr[3] = new SCV();
		arr[4] = new Tank();
		arr[5] = new SCV();
		
		for(int i = 0 ; i < arr.length ; i ++) {
			arr[i].attack();
		}
		
		for(int i = 0 ; i < arr.length ; i ++) {
			arr[i].move();
		}
		for(int i = 0 ; i < arr.length ; i ++) {
			arr[i].stop();
		}
		for(int i = 0 ; i < arr.length ; i ++) {
			
			if(arr[i] instanceof UseSteamPackAble) {
				UseSteamPackAble m = (UseSteamPackAble)arr[i];
				m.useSteamPack();
			}
			
		}
		
	}

}

interface UseSteamPackAble {
	public abstract void useSteamPack();
}

abstract class Unit{
	int hitPoint; //체력
	int attackPoint; //공격력
	int moveSpeed; //이동속도
	
	public abstract void attack();
	
	public abstract void move();
	
	public void stop() {
		System.out.println("유닛이 멈춥니다.");
	}
	
}

class SCV extends Unit{
	public SCV() {
		this.hitPoint = 40;
		this.attackPoint = 3;
		this.moveSpeed = 1;
	}
	
	public void attack() {
		System.out.println("SCV가 " + this.attackPoint + "로 근접 공격을 합니다.");
	}
	
	public void move() {
		System.out.println("SCV가 " + this.moveSpeed + "로 움직입니다.");
	}
	
}

//Unit은 상속받고 UseSteamPackAble은 구현해라 
class Marine extends Unit implements UseSteamPackAble {
	public Marine() {
		this.hitPoint = 50;
		this.attackPoint = 5;
		this.moveSpeed = 3;
	}
	
	public void attack() {
		System.out.println("Marin이  " + this.attackPoint + "로 원거리 공격을 합니다.");
	}
	
	public void move() {
		System.out.println("Marin이 " + this.moveSpeed + "로 움직입니다.");
	}
	
	public void useSteamPack() {
		System.out.println("Marin이 Steampack을 사용합니다.");
		this.attackPoint += 10;
		this.moveSpeed += 3;
	}
}

class Tank extends Unit{
	public Tank() {
		this.hitPoint = 200;
		this.attackPoint = 20;
		this.moveSpeed = 5;
	}
	
	public void attack() {
		System.out.println("Tank가 " + this.attackPoint + "로 원거리 공격을 합니다.");
		
	}
	
	public void move() {
		System.out.println("Tank가 " + this.moveSpeed + "로 움직입니다.");
	}
}