import java.util.Scanner;

public class PracticeQuiz {
	public String name;
	public int korScore;
	public int engScore;
	public int mathScore;
	public static int korTotal=0;
	public static int engTotal=0;
	public static int mathTotal=0;

	public PracticeQuiz(String name) {
		this.name = name;
	}
	
	public void InputData() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름 : ");
		this.name = scan.nextLine();
		System.out.println("국어 : ");
		this.korScore = scan.nextInt();
		System.out.println("영어 : ");
		this.engScore = scan.nextInt();
		System.out.println("수학 : ");
		this.mathScore = scan.nextInt();

		
	}
}
