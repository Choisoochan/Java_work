import java.util.Scanner;

public class sumClass {
	public static void main(String[] args) {
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է�.");
		int number1 = scan2.nextInt();
		
		System.out.println("�ι�° ���� �Է�.");
		int number2 = scan2.nextInt();
		
		int sumNumber = number1 + number2;
		
		System.out.printf("%d�� %d�� ���� %d�Դϴ�.", number1, number2, sumNumber);
	}
}
