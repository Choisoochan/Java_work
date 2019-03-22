import java.util.Scanner;

public class compares {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hello";
		Scanner scan = new Scanner(System.in);
		String c = scan.nextLine();
		
		System.out.println(a==b);		
		System.out.println(a.equals(c));		
		System.out.println(a==c);
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
	}
}
