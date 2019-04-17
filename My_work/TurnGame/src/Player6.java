import java.util.Random;

public class Player6 extends Player {
	Player6() {
		this.hp = 150;
		this.name = "서보국보국보구기";
		System.out.println(this.name + "~임수황무거부기와두루미삼천갑자어쩌구저쩌구하며 나타났다.");
	}
	public int getAttackPower() {
		Random random = new Random();
		// 크리티컬 대미지 발동가능하도록
		int normalAttack = 10; 							// 크리티컬이 발동하지 않았을 때의 대미지 값
		int criticalAttack = random.nextInt(1000)+500;	// 크리티컬 발동하였을 때 대미지 값
		int hitCritical = random.nextInt(2);   			// 확률은 50%
		if(hitCritical == 1) {            				// 크리티컬 발동 시 랜덤한 크리티컬 대미지를 리턴
			System.out.println("Critical");
			return criticalAttack;
		}
		else {
			return normalAttack;						// 크리티컬 미발동 시 기본 대지미 값을 리턴
		}
		
	}
	public void beUnderAttak(int attackPower) {
		Random random = new Random();
		int hitNumber = random.nextInt(10);
		if (hitNumber <= 8) {
//			받은 데미지가 남아있는 hp 보다 클 경우 hp 값 100으로 재설정
			if (attackPower > hp) {
				hp = 100;
				System.out.println(this.name + "이(가) hp:100으로 부활했습니다");
			} else {
				hp = hp - attackPower;
				System.out.println(this.name + "이(가) " + attackPower + "의 데미지를 입었습니다.");
			}
			
		} else {
			System.out.println(this.name + "이(가) 회피했습니다.");
		}
//		player 남은 hp 출력
		System.out.println(this.name + "의 남은 HP:" + hp);
	}
}

