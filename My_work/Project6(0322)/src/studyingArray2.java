import java.util.Arrays;
import java.util.Scanner;


public class studyingArray2 {
	public static void main(String[] args) {
		Scanner inputA = new Scanner(System.in);
		Scanner inputB = new Scanner(System.in);
		
		System.out.print("학생숫자입력 : ");
		int count = inputA.nextInt(); 
		System.out.println(count + " 명의 국어점수를 입력받습니다.");
		
		int[] scoreKorean = new int[count];
				
		for(int i=0; i<scoreKorean.length; i++) {
			int studentNumber = i+1;
			System.out.print(studentNumber + "번 학생의 국어점수입력 : ");
			int userInput = inputA.nextInt();
			scoreKorean[i] = userInput;
		}
		
		System.out.println(count + " 명의 영어점수를 입력받습니다.");
		
		int[] scoreEnglish = new int[count];
		
		for(int i=0; i<scoreEnglish.length; i++) {
			int studentNumber = i+1;
			System.out.print(studentNumber + "번 학생의 국어점수입력 : ");
			int userInput = inputA.nextInt();
			scoreEnglish[i] = userInput;
		}
		
		
		int korTotal = 0;
		double korAvr= 0;
		
		for(int i=0; i < scoreKorean.length; i++) {
			korTotal = korTotal + scoreKorean[i];
		}
		korAvr = (double)korTotal/scoreKorean.length;
		
		System.out.println("국어 총점은 : " + korTotal);
		System.out.println("국어 평균은 : " + korAvr);
		
		int engTotal = 0;
		double engAvr= 0;
		
		for(int i=0; i < scoreKorean.length; i++) {
			engTotal = engTotal + scoreEnglish[i];
		}
		engAvr = (double)engTotal/scoreEnglish.length;
		
		System.out.println("영어 총점은 : " + engTotal);
		System.out.println("영어 평균은 : " + engAvr);
		
		

		
	}

}
