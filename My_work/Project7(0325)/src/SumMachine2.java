
public class SumMachine2 {
	public void doMake(int startNumber, int endNumber) {
		int totalNumber = 0;
		
		for (int i = startNumber; i <= endNumber; i++) {
			totalNumber += i;
		}
		
		System.out.println("start value : " + startNumber + ", end Value : " + endNumber);
		System.out.println("Summarize A to B :" + totalNumber);
	}
}
