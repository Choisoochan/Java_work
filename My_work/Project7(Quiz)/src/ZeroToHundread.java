

public class ZeroToHundread {
	public void CheckPrime2(int inputNumber){
		
		if(inputNumber < 1) {
			System.out.println("양수만 입력해주세요");
			return;
		}
		int startVal = 1;
		int endVal = 100;
		
		boolean isPrimeNumber = true;
		for (int i = 2; i<inputNumber; i++) {
			if(inputNumber % i == 0) {
				isPrimeNumber = false;
				break;
			}
		}
		
		if(isPrimeNumber) {
			System.out.println("" + inputNumber + "는 소수입니다.");
		}

	}
}
