import java.util.Random;
import java.util.Scanner;

public class Game1 {
	static int portionCheck = 0;
	public static void main(String[] args) {
		Player[] player = new Player[5];
		player[0] = new Player("용사1", 10);
		player[1] = new Player("용사2", 10);
		player[2] = new Player("용사3", 10);
		player[3] = new Player("용사4", 11);
		player[4] = new Player("용사5", 21);
		Enemy[] enemy = new Enemy[5];
		enemy[0] = new Enemy("고블린", 20);
		enemy[1] = new Enemy("오크", 50);
		enemy[2] = new Enemy("오우거", 80);
		enemy[3] = new Enemy("늑대인간", 100);
		enemy[4] = new Enemy("뱀파이어", 120);

		Scanner scanner = new Scanner(System.in);
		System.out.println("턴 진행은 엔터를 입력하세요.");
		for (int i = 0; i < 20; i++) {
			scanner.nextLine();
			System.out.println();
			
			// 메뉴를 생성하여 플레이어가 선택하도록
			System.out.println("행동을 선택하세요");
			System.out.println("1.공격 2.포션사용");
			int attackCheck = scanner.nextInt();
			
			// 메뉴 선택
			if(attackCheck == 1) {
				for (int j = 0; j < enemy.length; j++) {
					if (enemy[j].status()) {
						int attackPower = player[0].getAttackPower();
						enemy[j].beUnderAttak(attackPower);
					}
				}
				System.out.println();
				for (int j = 0; j < player.length; j++) {
					if (player[j].status()) {
						int attackPower = enemy[0].getAttackPower();
						player[j].beUnderAttak(attackPower);
					}
				}
			}
			
			// 포션사용을 체크, 포션은 플레이어 명수 만큼 사용 가능하도록
			else if(attackCheck == 2 && portionCheck < player.length) {
				if(portionCheck<player.length) {
					for (int j = 0; j < player.length; j++) {
						if (player[j].status()) {
							if(portionCheck <player.length) {
								player[j].healingHP();
								portionCheck +=1;							
							}			
						}
					}
				}
			}
			// 포션을 전부 사용하게 되면 사용 할 수 없다는 메세지 출력
			else if(attackCheck == 2 && portionCheck >= player.length) {
				System.out.println("더이상 포션을 사용할 수 없습니다.");
				
			}
			// 예외처리
			else {
				System.out.println("이상한거 누르지마");
			}
			
			// for문안으로 넣어서 모든 턴이 끝나기 전에 승패가 결정되면 게임을 끝낼 수 있도록
			int enemyCount = 0;
			for (int j = 0; j < enemy.length; j++) {
				if (enemy[j].status()) {
					enemyCount++;
				}
			}
			int playerCount = 0;
			for (int j = 0; j < player.length; j++) {
				if (player[j].status()) {
					playerCount++;
				}
			}
			
			if (enemyCount == 0 || playerCount == 0) {
				System.out.println("게임이 종료되었습니다.");
				if (enemyCount > playerCount) {
					System.out.println("적이 이겼습니다.");
				} else if (enemyCount < playerCount) {
					System.out.println("플레이어가 이겼습니다.");
				} else {
					System.out.println("비겼습니다.");
				}
				break;
			}

		}
		int enemyCount = 0;
		for (int j = 0; j < enemy.length; j++) {
			if (enemy[j].status()) {
				enemyCount++;
			}
		}
		int playerCount = 0;
		for (int j = 0; j < player.length; j++) {
			if (player[j].status()) {
				playerCount++;
			}
		}
		System.out.println("게임이 종료되었습니다.");
		if (enemyCount > playerCount) {
			System.out.println("적이 이겼습니다.");
		} else if (enemyCount < playerCount) {
			System.out.println("플레이어가 이겼습니다.");
		} else {
			System.out.println("비겼습니다.");
		}
		

	}
}
