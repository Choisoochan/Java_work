
public class test2 {
	public static void main(String[] args) {
		int sum=0;
		int sumType1=0;
		int sumType2=0;
		int sys;
		
		for (int i =0; i<101; i++) {
			sum= sum + i;
			if(i%2 == 0) {
				sumType1 = sumType1+i;
			}
			else {
				sumType2 = sumType2+i;
			}
		}
		System.out.println("1부터 100의 합계는 : " + sum);
		System.out.println("1부터 100중 짝수의 합계는: " + sumType1);		
		System.out.println("1부터 100중 홀수의 합계는: " + sumType2);
	}
}
