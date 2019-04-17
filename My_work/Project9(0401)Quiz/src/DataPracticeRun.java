import java.util.Arrays;

public class DataPracticeRun {	
	public static void main(String[] args) {
		DataPractice[] arr1 = new DataPractice[3];
		
		for(int i = 0; i<arr1.length; i++) {
			arr1[i] = new DataPractice((i+1) + "번 학생");
			arr1[i].inputData();
		}
		
		for(int i = 0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

}
