import java.util.Scanner;

public class RunClass {
	public static void main(String[] args) {
		Student[] stdArray = new Student[10];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < stdArray.length; i++) {
			stdArray[i] = new Student();
			System.out.println("" + (i+1) + "번째 학생 데이터 입력");
			System.out.println("이름 : ");
			stdArray[i].name = scan.nextLine();
			System.out.println("국어점수 : "); // "100" -> 100
			String korString = scan.nextLine();
			stdArray[i].korScore = Integer.parseInt(korString);
			System.out.println("영어점수 : ");
			String engString = scan.nextLine();
			stdArray[i].engScore = Integer.parseInt(engString);
			System.out.println("수학점수 : ");
			String mathString = scan.nextLine();
			stdArray[i].mathScore = Integer.parseInt(mathString);

		
//		Student s1;
//		Student[] stdArray = new Student[10];
//		
//		s1 = new Student();
//		stdArray[0] = new Student();
//		
//		s1.korScore = 10;
//		stdArray[0].korScore = 10;
		
		}
	}
}
