
public class TenToEight {
	static int inputCheck = 0;
	public void Quotient(int input) {
		while(input>8) {
			if(input>=8) {
				input = input / 8;
			}else if(input < 8){
				System.out.println(input);
				break;
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		TenToEight quo = new TenToEight();
		quo.Quotient(129);
	}
}
