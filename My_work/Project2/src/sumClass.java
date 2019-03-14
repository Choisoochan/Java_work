import java.util.Scanner;

public class sumClass {
	public static void main(String[] args) {
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("첫번째 숫자 입력.");
		int number1 = scan2.nextInt();
		
		System.out.println("두번째 숫자 입력.");
		int number2 = scan2.nextInt();
		
		int sumNumber = number1 + number2;
		
		System.out.printf("%d와 %d의 합은 %d입니다.", number1, number2, sumNumber);
	}
}
