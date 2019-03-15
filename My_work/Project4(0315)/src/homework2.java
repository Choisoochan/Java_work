import java.util.Random;
import java.util.Scanner;

public class homework2 {
	public static void main(String[] args) {
		Scanner inputFromUser = new Scanner(System.in);
		Random case1 = new Random();
		
		System.out.println("가위바위보를 숫자로 선택해주세요");
		System.out.println("가위:0  바위:1 보:2");
		int userChoice = inputFromUser.nextInt();

			if (userChoice <= 2) {
				int computerChoice = case1.nextInt(3);
				
				
				if (userChoice == 0)
					System.out.println("'가위'를 선택하셨습니다.");
				else if (userChoice == 1)
					System.out.println("'바위'를 선택하셨습니다.");
				else
					System.out.println("'보'를 선택하셨습니다.");
				

				if (computerChoice == 0)
					System.out.println("컴퓨터는 '가위'를 선택했습니다.");
				else if (computerChoice == 1)
					System.out.println("컴퓨터는 '바위'를 선택했습니다.");
				else
					System.out.println("컴퓨터는 '보'를 선택했습니다.");
				
				
				
				if (userChoice == computerChoice)
					System.out.println("비겼습니다");
				else if(userChoice == 0 && computerChoice==1 )
					System.out.println("컴퓨터 승리");
				else if(userChoice == 0 && computerChoice==2 )
					System.out.println("유저 승리");
				else if(userChoice == 1 && computerChoice==0 )
					System.out.println("유저 승리");
				else if(userChoice == 1 && computerChoice==2 )
					System.out.println("컴퓨터 승리");
				else if(userChoice == 2 && computerChoice==1 )
					System.out.println("유저 승리");
				else
					System.out.println("컴퓨터 승리");
			}
			else {
				System.out.println("0~2사이의 숫자를 입력해주세요");
			}

	}

}
