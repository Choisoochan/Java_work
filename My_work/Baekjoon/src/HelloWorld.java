import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("강한친구 대한육군");
		System.out.println("강한친구 대한육군");
		
		int[] arr = {1,2,3,4,5};
		int [] arr2 = arr;
		int [] arr3 = arr2;
		arr3[0] = 10;
		
		System.out.println(arr);
		System.out.println(arr2);
		System.out.println(arr3);
	}
	
}
