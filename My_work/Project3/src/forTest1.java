import java.util.Scanner;

public class forTest1 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("������ ���");
		System.out.println("����� ����ұ��?");
		int number = scanf.nextInt();
		
		for(int i = 1; i<10; i++) {
//			System.out.print(number);
//			System.out.print(" x ");
//			System.out.print(i);
//			System.out.print(" = ");
//			System.out.println(number*i);
			
			//����ƽ ���
			System.out.printf("%d x %d = %d", number, i, number*i);
			System.out.println('\t');
		}

	}
}
