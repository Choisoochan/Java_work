import java.util.Scanner;

public class AB {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int temp = N/5;
		int myTemp = temp;
		temp = temp/3;
		myTemp = myTemp + temp;
		if(myTemp != 0) {
			System.out.println(myTemp);
		}else if(temp != 0) {
			
			System.out.println(-1);
		}
		
		
	}
}
