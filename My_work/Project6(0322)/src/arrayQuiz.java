import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class arrayQuiz {
	public static void main(String[] args) {
		Random r = new Random();
		int[] randValArr = new int[30];
		
		for(int i = 0; i<randValArr.length; i++) {
			randValArr[i] = r.nextInt(100);
		}
		Arrays.sort(randValArr);
		System.out.print(Arrays.toString(randValArr));
	
		Scanner numInput = new Scanner(System.in);

		int [][] arr = new int[4][4];
		


		for(int i = 0 ; i < arr.length-1; i++) {
            for(int j = 0; j< arr.length-1; j++) {
            	arr[i][j] = numInput.nextInt();          	
            }
        }
		
		
		for(int i = 0 ; i < arr.length; i++) {
			int sumArrColumn = 0;
			int sumArrRow = 0;			
            for(int j = 0; j<arr[i].length; j++) {
            	sumArrRow = sumArrRow + arr[j][i];    
            	sumArrColumn = sumArrColumn + arr[i][j];            	        	
            }
            arr[3][i] = sumArrRow;
            arr[i][3] = sumArrColumn;
		}
		

		
		for(int i = 0 ; i < arr.length; i++) {
            for(int j = 0; j< arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");                
            }
            System.out.println("");
		}

	}
}
