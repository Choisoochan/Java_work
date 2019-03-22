import java.util.Arrays;
import java.util.Scanner;


public class testtest {
	public static void main(String[] args) {
		Scanner inputA = new Scanner(System.in);

		System.out.print("학생숫자입력 : ");
		int count = inputA.nextInt(); 
		

		
		String [] nameArr = new String [count];
		System.out.println("학생이름입력");
		for(int i=0; i<nameArr.length; i++) {
			nameArr[i] = inputA.next();
		}
		System.out.println(Arrays.toString(nameArr));
		
		System.out.println(count + " 명의 국어점수를 입력받습니다.");
		
	}


}
