import java.util.Random;
import java.util.Arrays;

public class RunClass {
	public static void main(String[] args) {
		Random random = new Random();
		StudentData studentArr[] = new StudentData[10];
		
		// Insert Data to Object
		for(int i=0; i<studentArr.length; i++) {
			studentArr[i] = new StudentData();
			studentArr[i].name = (i + 1) + "";
			studentArr[i].korScore = random.nextInt(30)+70;
			studentArr[i].engScore = random.nextInt(30)+70;
			studentArr[i].mathScore = random.nextInt(30)+70;
			studentArr[i].totalScore = studentArr[i].korScore + studentArr[i].engScore + studentArr[i].mathScore;
		}
		
		
		// Selection Sort
		for(int i = 0; i<studentArr.length; i++) {
			for(int j = i; j<studentArr.length; j++) {				
				if(studentArr[i].totalScore < studentArr[j].totalScore) {
					StudentData tmp = studentArr[i];
					studentArr[i] = studentArr[j];
					studentArr[j] = tmp;
				}
			}
		}
		
		// Bubble Sort
//		for (int i = studentArr.length-1; i > 0 ; i--) {
//			for(int j=0; j<i; j++) {
//				if(studentArr[j].totalScore < studentArr[j+1].totalScore) {
//					StudentData tmp = studentArr[i];
//					studentArr[i] = studentArr[j];
//					studentArr[j] = tmp;
//				}
//			}
//		}
		
		
		// Insert Sort
//		for (int i = 1; i < studentArr.length; i++) {
//			for(int j = i; j>0; j--) {
//				if(studentArr[j-1].totalScore < studentArr[j].totalScore) {
//					StudentData tmp = studentArr[j-1];
//					studentArr[j-1] = studentArr[j];
//					studentArr[j] = tmp;
//				}
//			}
//		}
		
		
		// Show Result
		for (int i = 0; i < studentArr.length; i++) {
			System.out.print(studentArr[i].printResult());
			System.out.println("       "+ (i+1) + "등");
		}
	}
}
