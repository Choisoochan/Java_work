
public class StudentRunProfFin {
	public static void main(String[] args) {
		StudentProfFin[] stdArray = new StudentProfFin[3];
		
		for(int i = 0; i < stdArray.length; i++) {
			stdArray[i] = new StudentProfFin((i+1) + "번 학생");
			stdArray[i].inputData();
		}
		
		for(int i = 0; i<stdArray.length; i++) {
			System.out.println(stdArray[i].name + " " +stdArray[i].midScore + "점 " + stdArray[i].finScore + "점 ");

		}
				
	}
}
