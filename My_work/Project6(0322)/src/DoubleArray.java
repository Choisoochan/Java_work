import java.util.Scanner;
import java.util.Arrays;

public class DoubleArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("원하는 배열의 크기를 입력하세요.");
		int inputUser = scan.nextInt();
		int [][] arr1 = new int [inputUser+1][inputUser+1];

		
		System.out.println("배열에 들어갈 숫자를 입력하세요.");
		
		for( int i = 0; i <inputUser; i++) {			
			for (int j = 0; j <inputUser; j++) {				
				int indexVal = scan.nextInt();
				arr1[i][j] = indexVal;
				arr1[i][inputUser]=arr1[i][inputUser]+indexVal;
				arr1[inputUser][j]=arr1[inputUser][j]+indexVal;
			}
		}
		
		for( int i = 0; i <arr1.length; i++) {
			for (int j = 0; j <arr1.length; j++) {	
				System.out.print(arr1[i][j] + " ");		
				}						
			System.out.println(" ");
		}
	}
		
	
}
