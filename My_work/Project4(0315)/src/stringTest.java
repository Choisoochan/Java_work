import java.util.Random;
import java.util.Scanner;


public class stringTest {
	public static void main(String[] args) {
		Scanner inputFromUser = new Scanner(System.in);	
		Random caseCom = new Random();
		
		System.out.println("����,����,�� �߿� �����ϼ���");
		
		int computerChoice = caseCom.nextInt(3);
	
		String inputText = inputFromUser.nextLine();
		
		if(inputText.equals("����")) {
			if(computerChoice == 0) {
				if (computerChoice == 0)
					System.out.println("��ǻ�ʹ� '����'�� �����߽��ϴ�.");
				else if (computerChoice == 1)
					System.out.println("��ǻ�ʹ� '����'�� �����߽��ϴ�.");
				else
					System.out.println("��ǻ�ʹ� '��'�� �����߽��ϴ�.");
				System.out.println("�����ϴ�.");
				
			}
			else if(computerChoice == 1) {
				if (computerChoice == 0)
					System.out.println("��ǻ�ʹ� '����'�� �����߽��ϴ�.");
				else if (computerChoice == 1)
					System.out.println("��ǻ�ʹ� '����'�� �����߽��ϴ�.");
				else
					System.out.println("��ǻ�ʹ� '��'�� �����߽��ϴ�.");
				System.out.println("�����ϴ�.");
			}
			else {
				if (computerChoice == 0)
					System.out.println("��ǻ�ʹ� '����'�� �����߽��ϴ�.");
				else if (computerChoice == 1)
					System.out.println("��ǻ�ʹ� '����'�� �����߽��ϴ�.");
				else
					System.out.println("��ǻ�ʹ� '��'�� �����߽��ϴ�.");
				System.out.println("�̰���ϴ�.");				
			}
		}
		else if(inputText.equals("����")) {
			if(computerChoice == 0) {
				if (computerChoice == 0)
					System.out.println("��ǻ�ʹ� '����'�� �����߽��ϴ�.");
				else if (computerChoice == 1)
					System.out.println("��ǻ�ʹ� '����'�� �����߽��ϴ�.");
				else
					System.out.println("��ǻ�ʹ� '��'�� �����߽��ϴ�.");
				System.out.println("�̰���ϴ�.");
			}
			else if(computerChoice == 1) {
				if (computerChoice == 0)
					System.out.println("��ǻ�ʹ� '����'�� �����߽��ϴ�.");
				else if (computerChoice == 1)
					System.out.println("��ǻ�ʹ� '����'�� �����߽��ϴ�.");
				else
					System.out.println("��ǻ�ʹ� '��'�� �����߽��ϴ�.");
				System.out.println("�����ϴ�.");
			}
			else {
				if (computerChoice == 0)
					System.out.println("��ǻ�ʹ� '����'�� �����߽��ϴ�.");
				else if (computerChoice == 1)
					System.out.println("��ǻ�ʹ� '����'�� �����߽��ϴ�.");
				else
					System.out.println("��ǻ�ʹ� '��'�� �����߽��ϴ�.");
				System.out.println("�����ϴ�.");				
			}
			
		}
		else if(inputText.equals("��")) {
			if(computerChoice == 0) {
				if (computerChoice == 0)
					System.out.println("��ǻ�ʹ� '����'�� �����߽��ϴ�.");
				else if (computerChoice == 1)
					System.out.println("��ǻ�ʹ� '����'�� �����߽��ϴ�.");
				else
					System.out.println("��ǻ�ʹ� '��'�� �����߽��ϴ�.");
				System.out.println("�����ϴ�");
			}
			else if(computerChoice == 1) {
				if (computerChoice == 0)
					System.out.println("��ǻ�ʹ� '����'�� �����߽��ϴ�.");
				else if (computerChoice == 1)
					System.out.println("��ǻ�ʹ� '����'�� �����߽��ϴ�.");
				else
					System.out.println("��ǻ�ʹ� '��'�� �����߽��ϴ�.");
				System.out.println("�̰���ϴ�.");
			}
			else {
				if (computerChoice == 0)
					System.out.println("��ǻ�ʹ� '����'�� �����߽��ϴ�.");
				else if (computerChoice == 1)
					System.out.println("��ǻ�ʹ� '����'�� �����߽��ϴ�.");
				else
					System.out.println("��ǻ�ʹ� '��'�� �����߽��ϴ�.");
				System.out.println("�����ϴ�.");				
			}
			
		}
		
		
		
		

		
	}

}
