import java.util.Random;
import java.util.Scanner;


public class stringTest {
	public static void main(String[] args) {
		Scanner inputFromUser = new Scanner(System.in);	
		Random caseCom = new Random();
		
		System.out.println("가위,바위,보 중에 선택하세요");
		
		int computerChoice = caseCom.nextInt(3);
	
		String inputText = inputFromUser.nextLine();
		
		if(inputText.equals("가위")) {
			if(computerChoice == 0) {
				if (computerChoice == 0)
					System.out.println("컴퓨터는 '가위'를 선택했습니다.");
				else if (computerChoice == 1)
					System.out.println("컴퓨터는 '바위'를 선택했습니다.");
				else
					System.out.println("컴퓨터는 '보'를 선택했습니다.");
				System.out.println("비겼습니다.");
				
			}
			else if(computerChoice == 1) {
				if (computerChoice == 0)
					System.out.println("컴퓨터는 '가위'를 선택했습니다.");
				else if (computerChoice == 1)
					System.out.println("컴퓨터는 '바위'를 선택했습니다.");
				else
					System.out.println("컴퓨터는 '보'를 선택했습니다.");
				System.out.println("졌습니다.");
			}
			else {
				if (computerChoice == 0)
					System.out.println("컴퓨터는 '가위'를 선택했습니다.");
				else if (computerChoice == 1)
					System.out.println("컴퓨터는 '바위'를 선택했습니다.");
				else
					System.out.println("컴퓨터는 '보'를 선택했습니다.");
				System.out.println("이겼습니다.");				
			}
		}
		else if(inputText.equals("바위")) {
			if(computerChoice == 0) {
				if (computerChoice == 0)
					System.out.println("컴퓨터는 '가위'를 선택했습니다.");
				else if (computerChoice == 1)
					System.out.println("컴퓨터는 '바위'를 선택했습니다.");
				else
					System.out.println("컴퓨터는 '보'를 선택했습니다.");
				System.out.println("이겼습니다.");
			}
			else if(computerChoice == 1) {
				if (computerChoice == 0)
					System.out.println("컴퓨터는 '가위'를 선택했습니다.");
				else if (computerChoice == 1)
					System.out.println("컴퓨터는 '바위'를 선택했습니다.");
				else
					System.out.println("컴퓨터는 '보'를 선택했습니다.");
				System.out.println("비겼습니다.");
			}
			else {
				if (computerChoice == 0)
					System.out.println("컴퓨터는 '가위'를 선택했습니다.");
				else if (computerChoice == 1)
					System.out.println("컴퓨터는 '바위'를 선택했습니다.");
				else
					System.out.println("컴퓨터는 '보'를 선택했습니다.");
				System.out.println("졌습니다.");				
			}
			
		}
		else if(inputText.equals("보")) {
			if(computerChoice == 0) {
				if (computerChoice == 0)
					System.out.println("컴퓨터는 '가위'를 선택했습니다.");
				else if (computerChoice == 1)
					System.out.println("컴퓨터는 '바위'를 선택했습니다.");
				else
					System.out.println("컴퓨터는 '보'를 선택했습니다.");
				System.out.println("졌습니다");
			}
			else if(computerChoice == 1) {
				if (computerChoice == 0)
					System.out.println("컴퓨터는 '가위'를 선택했습니다.");
				else if (computerChoice == 1)
					System.out.println("컴퓨터는 '바위'를 선택했습니다.");
				else
					System.out.println("컴퓨터는 '보'를 선택했습니다.");
				System.out.println("이겼습니다.");
			}
			else {
				if (computerChoice == 0)
					System.out.println("컴퓨터는 '가위'를 선택했습니다.");
				else if (computerChoice == 1)
					System.out.println("컴퓨터는 '바위'를 선택했습니다.");
				else
					System.out.println("컴퓨터는 '보'를 선택했습니다.");
				System.out.println("비겼습니다.");				
			}
			
		}
		
		
		
		

		
	}

}
