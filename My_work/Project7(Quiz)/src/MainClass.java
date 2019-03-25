

public class MainClass {
	public static void main(String[] args) {
		SumNumber sumNum = new SumNumber();		
		sumNum.doSum(8, 500);
		
		
		CheckPrime check = new CheckPrime();
		check.checkPrime();
		
		
		ZeroToHundread check2 = new ZeroToHundread();
		
		for(int i = 0; i<100; i++) {
			check2.CheckPrime2(i+1);
		}	
		

		MultipleSix check3 = new MultipleSix();
		for(int i = 0; i<100; i++) {
			check3.CheckMultipleSix(i+1);
		}	
		
		MultipleSix2 check4 = new MultipleSix2();
		System.out.println("6의 배수는");
		for (int i = 0; i <100; i++) {
			int checkNum = i+1;
			boolean result = check4.doCheck(checkNum);
			if(result) {
				System.out.print(" " + (checkNum));
			}
		}
	}

}



