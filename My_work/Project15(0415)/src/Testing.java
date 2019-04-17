import java.util.Arrays;

public class Testing {

	public static void main(String[] args) {
		RandomTesting rand = new RandomTesting();
		int []arr1 = rand.newMethod(100);
		System.out.println(Arrays.toString(arr1));
		Random3 rand2 = new Random3();
		rand2.nextInt2(100);
		System.out.println(Arrays.toString(rand2.arr));
		
//		System.out.println(rand.newMethod(10));
	}

}
