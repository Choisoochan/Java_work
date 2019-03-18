import java.util.Random;
import java.util.Scanner;

public class diceGameWithCom {
	public static void main(String[] args) {
		Scanner inputFromUser = new Scanner(System.in);
		Random r = new Random();
		int userChoice = r.nextInt(5)+1;
		int comChoice = r.nextInt(5)+1;
		
		System.out.print("화면에 주사위를 굴릴까요?");		
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
