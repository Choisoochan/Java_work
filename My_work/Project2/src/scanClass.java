import java.util.Scanner;

public class scanClass {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		//��ĳ���Լ��� ���� ���� �� �Է¹ޱ�
		
		System.out.println("ȭ�鿡 1��° ������ ���ڸ� �Է��� �ּ���!");
		int intType1 = s.nextInt();
		System.out.print("����� �Է��� ���ڴ� : ");
		System.out.println(intType1);	
		System.out.println('\t');
		System.out.println("ȭ�鿡 2��° ������ ���ڸ� �Է����ּ���!");
		int intType2 = s.nextInt();
		System.out.print("����� �Է��� ���ڴ� : ");
		System.out.println(intType2);
		System.out.println('\t');
		
		//�Է¹��� ���� ���� �پ��� ���·� ����
		
		System.out.print("ù��° �Է°��� 10�� ���� '");
		System.out.print(intType1+10);
		System.out.println("'�Դϴ�.");	
		
		System.out.print("�� ������ ���� '");
		System.out.print(intType1+intType2);
		System.out.println("'�Դϴ�.");
		
		System.out.print("�� ������ ���� '");
		System.out.print(intType1*intType2);
		System.out.print("'�Դϴ�.");
		
		
	}

}
