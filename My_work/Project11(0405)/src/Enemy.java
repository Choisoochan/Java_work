import java.util.Random;

public class Enemy {
	String name = "";
	int hp = 0;

	
	Random random = new Random();
	Enemy(String name, int hp){
		
		this.name = name;
		this.hp = hp;
	}
	
	public boolean status() {
		if(hp > 0) {
			return true;
		}
		return false;
	}
	
	public int getAttackPower() {
		return 10;
	}
	
	public void beUnderAttack(int attackPower) {
		Random random = new Random();
		int hitNumber = random.nextInt(5);
		if (hitNumber == 3) {
			hp = hp - attackPower;
			System.out.println(this.name + " 이(가) "+attackPower+"의 피해를 입었습니다.");
			
		} else {
			System.out.println(this.name + " 이(가) 회피하였습니다.");
		}
	}
}
