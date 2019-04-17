
public class PracticeQuizRun {
	public static void main(String[] args) {
		PracticeQuiz[] arr1 = new PracticeQuiz[3];
		
		int stdTotal = 0;
		
		for(int i = 0; i<arr1.length; i++) {
			arr1[i] = new PracticeQuiz(i + "번째 학생");
			arr1[i].InputData();
			
			stdTotal = arr1[i].korScore + arr1[i].engScore + arr1[i].mathScore;
			PracticeQuiz.korTotal = PracticeQuiz.korTotal + arr1[i].korScore;
			PracticeQuiz.engTotal = PracticeQuiz.engTotal + arr1[i].engScore;
			PracticeQuiz.mathTotal = PracticeQuiz.mathTotal + arr1[i].mathScore;
			
		}
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i].name);
			System.out.print(" (총점 : " + stdTotal + ")");
			System.out.println(" (평균 : " + stdTotal/arr1.length + ")");
			
		}
		System.out.println("국어총점" + PracticeQuiz.korTotal);
		System.out.println("영어총점" + PracticeQuiz.engTotal);
		System.out.println("수학총점" + PracticeQuiz.mathTotal);
		System.out.println("국어평균" + PracticeQuiz.korTotal/arr1.length);
		System.out.println("영어평균" + PracticeQuiz.engTotal/arr1.length);
		System.out.println("수학평균" + PracticeQuiz.mathTotal/arr1.length);
	}
}
