import java.util.Scanner;

public class Game01 {
	public static void main(String[] args) {
		Player[] player = new Player[5];
		player[0] = new Player("폴리텍용사1", 10);
		player[1] = new Player("폴리텍용사2", 10);
		player[2] = new Player("폴리텍용사3", 10);
		player[3] = new Player("폴리텍용사4", 20);
		player[4] = new Player("폴리텍용사5", 30);
		Enemy[] enemy = new Enemy[5];
		enemy[0] = new Enemy("자바", 10);
		enemy[1] = new Enemy("스위프트", 20);
		enemy[2] = new Enemy("블록체인", 30);
		enemy[3] = new Enemy("파이썬", 20);
		enemy[4] = new Enemy("노드js", 10);
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("턴 진행을 위해 엔터를 입력하세요.");		
		for(int i = 0; i < 20; i++) {
			scanner.nextLine();
			
			//살아있는 적만 공격
			for(int j = 0; j < enemy.length; j++) {
				if (enemy[j].status()) {
//					enemy[j].beUnderAttack();
				}						
			}
			
			for(int j = 0; j < player.length; j++) {
				if (player[j].status()) {
					int attackPower = player[0].getAttackPower();
//					player[j].beUnderAttack();
				}						
			}
		}
		
		int enemyCount = 0;
		for (int j = 0; j < enemy.length; j++) {
			if(enemy[j].status()) {
				enemyCount++;
			}
		}
		
		int playerCount = 0;
		for (int j = 0; j < player.length; j++) {
			if(player[j].status()) {
				playerCount++;
			}
		}
		
		if(enemyCount > playerCount) {
			System.out.println("적의 승리.");
		} else if(playerCount > enemyCount) {
			System.out.println("플레이어 승리.");
		} else {
			System.out.println("비겼습니다.");
		}
	}
}
