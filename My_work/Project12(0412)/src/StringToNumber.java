import java.util.Scanner;

public class StringToNumber {
	public void CalculatingString() {
		Scanner scan = new Scanner(System.in);
		int tempA;
		int tempB;
		System.out.println("첫번째 숫자 입력 : ");
		String inputA = scan.nextLine();
		try {
			tempA = Integer.parseInt(inputA);
		} catch (Exception e) {
			tempA = 0;
			System.out.println("잘못된값을 입력하셨습니다. 0으로 초기화됩니다.");
			// TODO: handle exception
		}
		System.out.println("두번째 숫자 입력 : ");
		String inputB = scan.nextLine();
		try {
			tempB = Integer.parseInt(inputB);
		} catch (Exception e) {
			tempB = 0;
			System.out.println("잘못된값을 입력하셨습니다. 0으로 초기화됩니다.");
			// TODO: handle exception
		}
		
		
		
		System.out.println((float)tempA / tempB);
		
	}
}
