
public class SnailArrayTest {
	public static void main(String[] args) {
		String arraySnail [][] = new String[5][5];
		String filled = "■";
		String blank = "□";
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {	
				arraySnail[i][j] = filled;
				System.out.print(arraySnail[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
