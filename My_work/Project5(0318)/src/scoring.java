import java.util.Scanner;

public class scoring {
	public static void main(String[] args) {
		int score1;
		int score2;
		int score3;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("3명의 국어점수를 입력해주세요");
		System.out.print("학생1의 국어점수 : ");
		score1 = scan.nextInt();
		System.out.print("학생2의 국어점수 : ");
		score2 = scan.nextInt();
		System.out.print("학생3의 국어점수 : ");
		score3 = scan.nextInt();
		
		System.out.println("입력받은 점수 학생1 " + score1 +"점 " + "학생2 " + score2 + "점 "+"학생3 " + score3+"점");
		
		if (score1 > score2 && score1 > score3 && score2 > score3) {
			//1, 2, 3
			//System.out.println(score1 + " , " + score2 + " , " + score3);
			System.out.println("1등 학생1 : " + score1);
			System.out.println("2등 학생2 : " + score2);
			System.out.println("3등 학생3 : " + score3);
		}
		else if(score1 > score2 && score1 > score3 && score3 > score2) {
			//1, 3, 2
			//System.out.println(score1 + " , " + score3 + " , " + score2);
			System.out.println("1등 학생1 : " + score1);
			System.out.println("2등 학생3 : " + score3);
			System.out.println("3등 학생2 : " + score2);
		}
		else if(score2 > score1 && score2 > score3 && score1 > score3) {
			//2, 1, 3
			//System.out.println(score2 + " , " + score1 + " , " + score3);
			System.out.println("1등 학생2 : " + score2);
			System.out.println("2등 학생1 : " + score1);
			System.out.println("3등 학생3 : " + score3);
		}
		else if(score2 > score1 && score2 > score3 && score3 > score1) {
			//2, 3, 1
			//System.out.println(score2 + " , " + score3 + " , " + score1);
			System.out.println("1등 학생2 : " + score2);
			System.out.println("2등 학생3 : " + score3);
			System.out.println("3등 학생1 : " + score1);
		}
		else if(score3 > score1 && score3 > score2 && score1 > score2) {
			//3, 1, 2
			//System.out.println(score3 + " , " + score1 + " , " + score2);
			System.out.println("1등 학생3 : " + score3);
			System.out.println("2등 학생1 : " + score1);
			System.out.println("3등 학생2 : " + score2);
		}
		else if(score3 > score1 && score3 > score2 && score2 > score1) {
			//3, 2, 1
			//System.out.println(score3 + " , " + score2 + " , " + score1);
			System.out.println("1등 학생3 : " + score3);
			System.out.println("2등 학생2 : " + score2);
			System.out.println("3등 학생1 : " + score1);
		}
	}
}
