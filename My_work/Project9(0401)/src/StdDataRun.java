import java.util.Scanner;

public class StdDataRun {
	public static void main(String[] args) {
		StdData[] stdArray1 = new StdData[5];
		Scanner scan = new Scanner(System.in);
		int korMax = 0;
		int engMax = 0;
		int mathMax = 0;
		double korAvg = 0;
		double engAvg = 0;
		double mathAvg = 0;
		
		
		for(int i = 0; i<stdArray1.length; i++) {
			
			stdArray1[i] = new StdData();
			System.out.println("" + (i + 1) + "번째 학생 데이터 입력");
			System.out.println("이름 : ");
			stdArray1[i].name = scan.nextLine();
			System.out.println("국어 : ");
			String korString = scan.nextLine();
			stdArray1[i].korScore = Integer.parseInt(korString);
			System.out.println("수학 : ");
			String mathString = scan.nextLine();
			stdArray1[i].mathScore = Integer.parseInt(mathString);
			System.out.println("영어 : ");
			String engString = scan.nextLine();
			stdArray1[i].engScore = Integer.parseInt(engString);
			
			stdArray1[i].maxScore = stdArray1[i].korScore + stdArray1[i].mathScore + stdArray1[i].engScore;
			System.out.println("총점 : " + stdArray1[i].maxScore);
			stdArray1[i].avgScore = (stdArray1[i].korScore + stdArray1[i].mathScore + stdArray1[i].engScore)/3;
			System.out.println("평균 : " + stdArray1[i].avgScore);
			
			korMax = korMax + stdArray1[i].korScore;
			engMax = engMax + stdArray1[i].engScore;
			mathMax = mathMax + stdArray1[i].mathScore;
			
			
		}
		korAvg = (double)korMax / 5;
		engAvg = (double)engMax / 5;
		mathAvg = (double)mathMax / 5;
		
		System.out.println("국어총점 :" + korMax + "점");
		System.out.println("영어총점 :" + engMax + "점");
		System.out.println("수학총점 :" + mathMax + "점");
		
		System.out.println("국어평균 :" + korAvg + "점");
		System.out.println("영어평균 :" + engAvg + "점");
		System.out.println("수학평균 :" + mathAvg + "점");
		
	}
	

}
