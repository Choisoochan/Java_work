import java.util.Scanner;
import java.util.Arrays;
public class arrayTest {
	public static void main(String[] args) {
		Scanner inputA = new Scanner(System.in);
		
		System.out.print("학생숫자입력 : ");
		int count = inputA.nextInt(); 
		System.out.println(count + " 명의 점수를 입력받습니다.");
			
		int[] arr2 = new int[count];
		for (int j = 0; j <count; j++) {
			
			System.out.printf("%d번째 학생의 점수를 입력하세요 : ", j+1);
			arr2[j] = inputA.nextInt();
		}		
		
		int sumArr = 0;
		for (int k = 0; k <count; k++) {
			sumArr = sumArr + arr2[k];			
		}
		System.out.println("합계는 " + sumArr +"점 입니다.");
		
		double avgArr = (double)sumArr/count;
		System.out.println("평균은 " + avgArr +"점 입니다.");

		

		
		
	}
}
