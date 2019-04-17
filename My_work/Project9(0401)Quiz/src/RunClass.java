
public class RunClass {
	public static void main(String[] args) {
		StdData[] stdArray = new StdData[5];
		for (int i = 0; i<stdArray.length; i++) {
			stdArray[i] = new StdData();
			stdArray[i].inputStdData();
		}
		for(int i = 0; i<stdArray.length; i++) {
			StdData.midTermExamTotal = StdData.midTermExamTotal + stdArray[i].midTermExam;
			StdData.finalTermExamTotal = StdData.finalTermExamTotal + stdArray[i].finalExam;
		}
		
		System.out.println("중간 총점 : "+ StdData.midTermExamTotal);
		System.out.println("기말 총점 : "+ StdData.finalTermExamTotal);
	}
}
