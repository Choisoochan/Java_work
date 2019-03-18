import java.util.Random;
import java.util.Scanner;


public class forTesting {
	public static void main(String[] args) {
		
		Scanner score = new Scanner(System.in);
		Scanner studentCount = new Scanner(System.in);
		Random rand = new Random();	
		
		int count=0;
		int[] scoreArrays;
		System.out.println("몇명의 점수를 구하시겠습니까?");
		count = studentCount.nextInt();
		for(int i = 0; i<count; i++) {
			scoreArrays = new int[] {i};
			System.out.println("");
		}
		
		
		int sumScore = 0;
		double avgScore = 0;

		for(int i = 0; i<3; i++) {
			int randNumber = rand.nextInt(101);
			System.out.println("입력된 점수 : " + randNumber);
			sumScore = sumScore + randNumber;
		}
		
		System.out.println("총점은 " + sumScore + "입니다.");
		
		avgScore = (double)sumScore / 3;
		System.out.println("평균은 " + avgScore + "입니다.");
		

		
		
		
//		int sumScore;
//		int avgScore;
//		int inputScore;
//		
//		for(int i = 0; i<count; i++) {
//			inputScore = score.nextInt();
//			
//		}
//		System.out.println(inputScore);
//		
		
		
		
		
		
//		int inputScore1 = score.nextInt();
//		int inputScore2 = score.nextInt();
//		int inputScore3 = score.nextInt();
//		
//		int[] scoreArrays = new int[] {inputScore1, inputScore2, inputScore3};
//		Arrays.sort(scoreArrays);
//		
//		System.out.println("3등 : " + scoreArrays[0]);
//		System.out.println("2등 : " + scoreArrays[1]);
//		System.out.println("1등 : " + scoreArrays[2]);
//		
//		int sumScore = scoreArrays[0]+scoreArrays[1]+scoreArrays[2];
//		int avgScore = (scoreArrays[0]+scoreArrays[1]+scoreArrays[2])/3;
//		
//		System.out.println("총점 : " + sumScore);
//		System.out.println("평균 : " + avgScore);
	}
}
