import java.util.Scanner;

public class scoring {
	public static void main(String[] args) {
		int score1;
		int score2;
		int score3;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("3���� ���������� �Է����ּ���");
		System.out.print("�л�1�� �������� : ");
		score1 = scan.nextInt();
		System.out.print("�л�2�� �������� : ");
		score2 = scan.nextInt();
		System.out.print("�л�3�� �������� : ");
		score3 = scan.nextInt();
		
		System.out.println("�Է¹��� ���� �л�1 " + score1 +"�� " + "�л�2 " + score2 + "�� "+"�л�3 " + score3+"��");
		
		if (score1 > score2 && score1 > score3 && score2 > score3) {
			//1, 2, 3
			//System.out.println(score1 + " , " + score2 + " , " + score3);
			System.out.println("1�� �л�1 : " + score1);
			System.out.println("2�� �л�2 : " + score2);
			System.out.println("3�� �л�3 : " + score3);
		}
		else if(score1 > score2 && score1 > score3 && score3 > score2) {
			//1, 3, 2
			//System.out.println(score1 + " , " + score3 + " , " + score2);
			System.out.println("1�� �л�1 : " + score1);
			System.out.println("2�� �л�3 : " + score3);
			System.out.println("3�� �л�2 : " + score2);
		}
		else if(score2 > score1 && score2 > score3 && score1 > score3) {
			//2, 1, 3
			//System.out.println(score2 + " , " + score1 + " , " + score3);
			System.out.println("1�� �л�2 : " + score2);
			System.out.println("2�� �л�1 : " + score1);
			System.out.println("3�� �л�3 : " + score3);
		}
		else if(score2 > score1 && score2 > score3 && score3 > score1) {
			//2, 3, 1
			//System.out.println(score2 + " , " + score3 + " , " + score1);
			System.out.println("1�� �л�2 : " + score2);
			System.out.println("2�� �л�3 : " + score3);
			System.out.println("3�� �л�1 : " + score1);
		}
		else if(score3 > score1 && score3 > score2 && score1 > score2) {
			//3, 1, 2
			//System.out.println(score3 + " , " + score1 + " , " + score2);
			System.out.println("1�� �л�3 : " + score3);
			System.out.println("2�� �л�1 : " + score1);
			System.out.println("3�� �л�2 : " + score2);
		}
		else if(score3 > score1 && score3 > score2 && score2 > score1) {
			//3, 2, 1
			//System.out.println(score3 + " , " + score2 + " , " + score1);
			System.out.println("1�� �л�3 : " + score3);
			System.out.println("2�� �л�2 : " + score2);
			System.out.println("3�� �л�1 : " + score1);
		}
	}
}
