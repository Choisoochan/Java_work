import java.util.Scanner;

public class CheckPrime {
	public void checkPrime(){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("검사할 숫자를 입력해주세요");
		int inputNumber = scan.nextInt();
		
		boolean isPrimeNumber = true;
		for (int i = 2; i<inputNumber / 2; i++) {
			if(inputNumber % i == 0) {
				isPrimeNumber = false;
				break;
			}
		}
		
		if(isPrimeNumber) {
			System.out.println("소수입니다");
		}else {
			System.out.println("소수가아닙니다.");
		}
		
		
	}

}
