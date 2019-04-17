import java.util.Random;

public class Enemy {
	String name = "";
	int hp = 0;
	Enemy(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	public boolean status() {
		if (hp > 0) {
			return true;
		}
		return false;
	}
	public int getAttackPower() {
		return 10;
	}	
	public void beUnderAttak(int attackPower) {
		Random random = new Random();
		int hitNumber = random.nextInt(5);
		if (hitNumber == 3) {
			hp = hp - attackPower;			
			// 크리티컬 대미지 발동 시 대미지를 받은 적을 알림
			if(hp>0) {
				System.out.println(this.name + "이(가) " + attackPower + "의 피해를 입었습니다.");
			}
			if(hp < -20) {
				System.out.println("-----------Critical!!----------");
				System.out.println(this.name + " 에게 크리티컬 발동!!");
				System.out.println(attackPower + " 만큼의 피해를 입어 사망하였습니다.");
				System.out.println("-------------------------------");
			}
			
			
		} else {
			System.out.println(this.name + "이(가) 회피했습니다.");
		}
	}
}
