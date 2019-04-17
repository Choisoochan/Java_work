import java.util.Scanner;
import java.util.regex.Pattern;

public class inputTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		int i = 0;
		while(true){
			i+=1;
			input = scan.nextLine();
			input = input.trim();
			if(input.length()>=100) {
				input = input.substring(0, 100);
			}
			if(!checkType(input)) {
				input = "";
			}
			System.out.println(input);
			if(i>=100) {
				break;
			}
		}		
	}
	
	public static boolean checkType(String word) {
		return Pattern.matches("^[0-9a-zA-Z\\s]*", word);
	}

}
