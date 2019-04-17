import java.util.Random;

public class Random3 extends Random {
	int[] arr = new int[10];
	public void nextInt2(int range) {		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = super.nextInt(range);
		}

	}
}
