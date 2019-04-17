import java.util.Random;

public class RandomTesting extends Random{
	

	public int[] newMethod(int range) {
		int randArray[] = new int[10];
		for(int i = 0; i<10; i++) {
			randArray[i] = super.nextInt(range);
			
		}
		return randArray;
	}
	

}
