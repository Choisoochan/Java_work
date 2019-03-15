
public class booleanTest {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		boolean c;
		boolean d;
		boolean f;
		
		c = a==b;
		d = a!=b;
		System.out.println(c);
		System.out.println(d);
		
		f = (a!=b)||(a<b);
		System.out.println(f);
	}

}
