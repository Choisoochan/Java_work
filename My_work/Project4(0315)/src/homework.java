import java.util.Random;
import java.util.Scanner;

public class homework {
	public static void main(String[] args) {
		
		//임의의 값을 발생시켜 홀수 짝수를 판단하는 프로그램
		
		Random r = new Random();
		int randomValue = r.nextInt(100);
		int checkValue;
		checkValue = randomValue%2;
		
		System.out.println("임의의 값은 :" + randomValue);
		
//		System.out.print("임의의 값은 :");
//		System.out.println(randomValue);
		
		System.out.println("나머지 값은:" + checkValue);
		
//		System.out.print("나머지 값은:");
//		System.out.println(checkValue);
		
		System.out.println('\t');
		
	
		
		//임의로 발생시킨 값이 홀수인지 짝수인지 판단하는 프로그램
		
		Random r2 = new Random();
		int randomValue2 = r.nextInt(100);
		System.out.println("임의의 값은 :" + randomValue2);
//		System.out.print("임의의 값은 :");
//		System.out.println(randomValue2);
		
		int checkValue2 = randomValue2%2;
		if (checkValue2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		System.out.println('\t');
		
		
		//랜덤한 두가지 숫자의 비교
		
		Random r3 = new Random();
		Random r4 = new Random();
		int randomValue3 = r.nextInt(100);
		int randomValue4 = r.nextInt(100);
		
		System.out.println("첫번째 랜덤한 숫자" + randomValue3);
		System.out.println("두번째 랜덤한 숫자" + randomValue4);
		
		if (randomValue3 > randomValue4) {
			System.out.println("첫번째 숫자가 이겼습니다.");
		}
		else {
			System.out.println("두번째 숫자가 이겼습니다.");
			System.out.println('\r');
		}		
		
		
		//사용자가 원하는 값을 입력하여 짝수인지 홀수인지 판단해주는 프로그램
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("원하는 숫자는 : ");
		int inputNum = s.nextInt();

		if (inputNum%2==0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		
		
		
		
		Scanner inputFromUser = new Scanner(System.in);
		Random case1 = new Random();
		
		System.out.println("가위바위보를 숫자로 선택해주세요");
		System.out.println("가위:0  바위:1 보:2");		
		int userChoice = inputFromUser.nextInt();
		int computerChoice = case1.nextInt(2);
		
		
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
			System.out.println("컴퓨터는 '가위'를 선택했습니다.");
		
		
		
		
		
		

		
	}

}
