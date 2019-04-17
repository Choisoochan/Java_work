import java.util.Random;

public class Player {
	String name = "";
	int hp = 0;
	Random random = new Random();
	
	Player(String name, int hp) {
		this.hp = hp;
		this.name = name;
	}
	
	public boolean status() {
		if (hp > 0) {
			return true;
		}
		return false;
	}
	
	public int getAttackPower() {
		// 크리티컬 대미지 발동가능하도록
		int normalAttack = 10; 							// 크리티컬이 발동하지 않았을 때의 대미지 값
		int criticalAttack = random.nextInt(1000)+500;	// 크리티컬 발동하였을 때 대미지 값
		int hitCritical = random.nextInt(5);   			// 확률은 20%
		if(hitCritical == 1) {            				// 크리티컬 발동 시 랜덤한 크리티컬 대미지를 리턴
			return criticalAttack;
		}
		else {
			return normalAttack;						// 크리티컬 미발동 시 기본 대지미 값을 리턴
		}
	}
	
	public void healingHP() {
		int healedHP = random.nextInt(30)+10;
		this.hp = hp + healedHP;
		System.out.println(this.name + "이(가)" + healedHP + "만큼 hp를 회복하였습니다.");
	}

	
	public void beUnderAttak(int attackPower) {
		
		int hitNumber = random.nextInt(10);
		if (hitNumber == 1) {
			hp = hp - attackPower;
			System.out.println(this.name + "이(가) " + attackPower + "의 데미지를 입었습니다.");
		} else {
			System.out.println(this.name + "이(가) 회피했습니다.");
		}
	}
}
