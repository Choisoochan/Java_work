import java.util.Random;
import java.util.Scanner;

public class diceGameWithCom {
	public static void main(String[] args) {
		Scanner inputFromUser = new Scanner(System.in);
		Random r = new Random();
		int userChoice = 0;
		int comChoice = 0;
		
		for(int i=0; i < 10000; i++) {
			System.out.print("화면에 주사위를 굴릴까요? (종료하실려면 q를 입력하세요)");		
			
			//종료조건
			String inputString = inputFromUser.nextLine();
			if(inputString.equals("q")) {
				System.out.println("게임이 종료되었습니다.");
				break; //for문 탈출
			}
			
			//게임진행
			userChoice = r.nextInt(6)+1;
			comChoice = r.nextInt(6)+1;
			String inputAcept = inputFromUser.nextLine();
			System.out.println(userChoice);
			System.out.print("컴퓨터가 주사위를 굴립니다. 실행할까요?");
			String inputAcept2 = inputFromUser.nextLine();
			System.out.println(comChoice);
			
			if(userChoice == comChoice) {
				System.out.println("Draw");
			}else if(userChoice > comChoice) {
				System.out.println("You Win!");
			}else if(comChoice > userChoice) {
				System.out.println("You Lose!");
			}
		}
		
	}
}
