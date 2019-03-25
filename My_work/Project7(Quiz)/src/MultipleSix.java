
public class MultipleSix {
	public void CheckMultipleSix(int inputNumber){
		
		if(inputNumber < 1) {
			System.out.println("양수만 입력해주세요");
			return;
		}
		int startVal = 1;
		int endVal = 100;
		
		boolean isMultipleNumber = true;
		for (int i = 0; i<inputNumber; i++) {
			if(inputNumber % 6 == 0) {
				isMultipleNumber = false;
				break;
			}
		}
		
		if(!isMultipleNumber) {
			System.out.println("" + inputNumber + "는 6의 배수 입니다.");
		}

	}
	

}
