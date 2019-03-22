
public class summarizeNumer {
	public static void main(String[] args) {
		int sumAll=0;
		int sumZak=0;
		int sumHol=0;
		
		for (int i =0; i<=100; i++) {
			int number = i;
			sumAll = sumAll + number;
			
			int zakNumber = 0;
			int holNumber = number;
			
			if(number % 2 ==0) {
				zakNumber = number;
				holNumber = 0;
			}
			
			sumZak = sumZak + zakNumber;
			sumHol = sumHol + holNumber;
			
		}
		
		sumHol = sumAll - sumZak;
		System.out.println("1부터 100의 합계는 : " + sumAll);
		System.out.println("1부터 100중 짝수의 합계는: " + sumZak);		
		System.out.println("1부터 100중 홀수의 합계는: " + sumHol);
	}

}
