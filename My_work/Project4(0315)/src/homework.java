import java.util.Random;
import java.util.Scanner;

public class homework {
	public static void main(String[] args) {
		
		//������ ���� �߻����� Ȧ�� ¦���� �Ǵ��ϴ� ���α׷�
		
		Random r = new Random();
		int randomValue = r.nextInt(100);
		int checkValue;
		checkValue = randomValue%2;
		
		System.out.println("������ ���� :" + randomValue);
		
//		System.out.print("������ ���� :");
//		System.out.println(randomValue);
		
		System.out.println("������ ����:" + checkValue);
		
//		System.out.print("������ ����:");
//		System.out.println(checkValue);
		
		System.out.println('\t');
		
	
		
		//���Ƿ� �߻���Ų ���� Ȧ������ ¦������ �Ǵ��ϴ� ���α׷�
		
		Random r2 = new Random();
		int randomValue2 = r.nextInt(100);
		System.out.println("������ ���� :" + randomValue2);
//		System.out.print("������ ���� :");
//		System.out.println(randomValue2);
		
		int checkValue2 = randomValue2%2;
		if (checkValue2 == 0) {
			System.out.println("¦���Դϴ�.");
		}
		else {
			System.out.println("Ȧ���Դϴ�.");
		}
		System.out.println('\t');
		
		
		//������ �ΰ��� ������ ��
		
		Random r3 = new Random();
		Random r4 = new Random();
		int randomValue3 = r.nextInt(100);
		int randomValue4 = r.nextInt(100);
		
		System.out.println("ù��° ������ ����" + randomValue3);
		System.out.println("�ι�° ������ ����" + randomValue4);
		
		if (randomValue3 > randomValue4) {
			System.out.println("ù��° ���ڰ� �̰���ϴ�.");
		}
		else {
			System.out.println("�ι�° ���ڰ� �̰���ϴ�.");
			System.out.println('\r');
		}		
		
		
		//����ڰ� ���ϴ� ���� �Է��Ͽ� ¦������ Ȧ������ �Ǵ����ִ� ���α׷�
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("���ϴ� ���ڴ� : ");
		int inputNum = s.nextInt();

		if (inputNum%2==0) {
			System.out.println("¦���Դϴ�.");
		}
		else {
			System.out.println("Ȧ���Դϴ�.");
		}
		
		
		
		
		Scanner inputFromUser = new Scanner(System.in);
		Random case1 = new Random();
		
		System.out.println("������������ ���ڷ� �������ּ���");
		System.out.println("����:0  ����:1 ��:2");		
		int userChoice = inputFromUser.nextInt();
		int computerChoice = case1.nextInt(2);
		
		
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
			System.out.println("��ǻ�ʹ� '����'�� �����߽��ϴ�.");
		
		
		
		
		
		

		
	}

}
