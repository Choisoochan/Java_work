import java.util.Random;
import java.util.Scanner;

public class homework2 {
	public static void main(String[] args) {
		Scanner inputFromUser = new Scanner(System.in);
		Random case1 = new Random();
		
		System.out.println("������������ ���ڷ� �������ּ���");
		System.out.println("����:0  ����:1 ��:2");
		int userChoice = inputFromUser.nextInt();

			if (userChoice <= 2) {
				int computerChoice = case1.nextInt(3);
				
				
				if (userChoice == 0)
					System.out.println("'����'�� �����ϼ̽��ϴ�.");
				else if (userChoice == 1)
					System.out.println("'����'�� �����ϼ̽��ϴ�.");
				else
					System.out.println("'��'�� �����ϼ̽��ϴ�.");
				

				if (computerChoice == 0)
					System.out.println("��ǻ�ʹ� '����'�� �����߽��ϴ�.");
				else if (computerChoice == 1)
					System.out.println("��ǻ�ʹ� '����'�� �����߽��ϴ�.");
				else
					System.out.println("��ǻ�ʹ� '��'�� �����߽��ϴ�.");
				
				
				
				if (userChoice == computerChoice)
					System.out.println("�����ϴ�");
				else if(userChoice == 0 && computerChoice==1 )
					System.out.println("��ǻ�� �¸�");
				else if(userChoice == 0 && computerChoice==2 )
					System.out.println("���� �¸�");
				else if(userChoice == 1 && computerChoice==0 )
					System.out.println("���� �¸�");
				else if(userChoice == 1 && computerChoice==2 )
					System.out.println("��ǻ�� �¸�");
				else if(userChoice == 2 && computerChoice==1 )
					System.out.println("���� �¸�");
				else
					System.out.println("��ǻ�� �¸�");
			}
			else {
				System.out.println("0~2������ ���ڸ� �Է����ּ���");
			}

	}

}
