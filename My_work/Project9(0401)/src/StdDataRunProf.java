
public class StdDataRunProf {
	public static void main(String[] args) {
		StdDataProf[] stdArray = new StdDataProf[5];

		for(int i = 0; i<stdArray.length; i++) {
			stdArray[i] = new StdDataProf();
			stdArray[i].inputScore();
		}
		
		for (int i = 0; i < stdArray.length; i ++) {
			StdDataProf.korTotal = StdDataProf.korTotal + stdArray[i].korScore;
			StdDataProf.engTotal = StdDataProf.engTotal + stdArray[i].engScore;
			StdDataProf.mathTotal = StdDataProf.mathTotal + stdArray[i].mathScore;
		}
		
		System.out.println("국어 총점은 : " + StdDataProf.korTotal);
		System.out.println("영어 총점은 : " + StdDataProf.engTotal);
		System.out.println("수학 총점은 : " + StdDataProf.mathTotal);
		
		System.out.println("국어 평균은 : " + ((double)StdDataProf.korTotal)/stdArray.length);
		System.out.println("영어 평균은 : " + ((double)StdDataProf.engTotal)/stdArray.length);
		System.out.println("수학 평균은 : " + ((double)StdDataProf.mathTotal)/stdArray.length);
	}
}
