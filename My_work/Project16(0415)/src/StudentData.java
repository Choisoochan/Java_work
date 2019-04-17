import java.util.Random;

public class StudentData {
	String name = "";
	int korScore = 0;
	int engScore = 0;
	int mathScore = 0;
	int totalScore = 0;
	

	public String printResult() {
		// 1,2,3 등의 숫자 앞에 공백을 붙여줌
		if(this.name.length()<2) {
			this.name = " " + this.name;
		}
		return  this.name + "번 학생 - " + "(국어점수 : " + this.korScore + " 영어점수 : "
				+ this.engScore + " 수학점수 : " + this.mathScore + ") , 총점 : " 
				+ this.totalScore;
	}
}

