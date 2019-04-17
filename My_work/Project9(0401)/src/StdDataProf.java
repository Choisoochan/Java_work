import java.util.Scanner;

public class StdDataProf {
	String name;
	int korScore;
	int engScore;
	int mathScore;
	static int korTotal=0;
	static int engTotal=0;
	static int mathTotal=0;
	
	public void inputScore() {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		this.name = scan.nextLine();
		
		System.out.println("국어점수를 입력해주세요.");
		String tmp = scan.nextLine();
		this.korScore = Integer.parseInt(tmp);

		System.out.println("영어점수를 입력해주세요.");
		tmp = scan.nextLine();
		this.engScore = Integer.parseInt(tmp);
		
		System.out.println("수학점수를 입력해주세요.");
		tmp = scan.nextLine();
		this.mathScore = Integer.parseInt(tmp);
		
	}
}
