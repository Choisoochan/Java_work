
public class SumNumber {
	public void doSum(int startVal, int endVal){		
		int result = 0;
		
		for( int i = startVal; i<=endVal; i++) {
			result = result + i;
		}
		
		System.out.println(startVal + "부터 "+ endVal + "까지의 합은 " + result + "입니다.");
	}
}
