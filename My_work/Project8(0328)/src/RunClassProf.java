import java.util.Scanner;

public class RunClassProf {
	public static void main(String[] args) {
		MoneyBoxProf moneyBox = new MoneyBoxProf();
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i<99999999; i++) {
			System.out.println("메뉴 선택 1.입금, 2.입금+메세지, 3.종료 : ");
			int selectMenu = scan.nextInt();
			if (selectMenu == 1) {
				System.out.println("입금할 금액 : ");
				int coin = scan.nextInt();
				moneyBox.deposit(coin, "");
			} else if (selectMenu == 2) {
				System.out.println("입금할 금액 : ");
				int coin = scan.nextInt();
				scan.nextLine();
				String message = scan.nextLine();
				moneyBox.deposit(coin, message);
			} else if (selectMenu == 3) {
				moneyBox.crash();
				break;
			}
			
		}
		

	}
}
