
public class test2 {
	public static void main(String[] args) {
		int sum=0;
		int sumType1=0;
		int sumType2=0;
		
		for (int i = 0; i<101; i++) {
			sum= sum + i;
		}		
		System.out.println("1부터 100의 합계는 : " + sum);
		
		
		for (int i =0; i<101; i++) {
			if(i%2 == 0) {
				sumType1 = sumType1+i;
			}
		}
		System.out.println("1부터 100중 짝수의 합계는: " + sumType1);
		
		for (int i =0; i<101; i++) {
			if(i%2 != 0) {
				sumType2 = sumType2+i;
			}
		}
		System.out.println("1부터 100중 홀수의 합계는: " + sumType2);
	}
}
