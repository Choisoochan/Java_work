package test1;

import java.util.Scanner;

public class TenToEight {	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("10진수 숫자를 입력해주세요 : ");
		int inputNum = scan.nextInt();
		int inputNum2 = inputNum;
		
		TenToEight cal = new TenToEight();
		
		String result;
		String result2;
		
		result = Integer.toString(cal.CalculateQuo(inputNum));
		result2 = cal.CalculateRemainder(inputNum2);
		
		System.out.print("8진수로는 " + result + result2 + " 입니다.");
	}
	
	public int CalculateQuo(int input) {
		
		// while문을 사용해서
		
		while(true) {
			if(input>=8) {
				input = input / 8;
			}else if(input < 8){
				break;
			}
		}
		
		// for문을 사용해서
		
//		for(int i = 0; i<1;) {
//			if(input>=8) {
//				input = input / 8;
//			}else if(input < 8){
//				break;
//			}
//		}
		return input;
	}
	
	
	
	// 나머지를 구해주는 합수
	
	public String CalculateRemainder(int input) {
		String Remain = "";
		String Remain2 = "";
		
		// while문을 사용해서
		
//		while(true) {
//			if(input>=8) {
//				Remain2 = Integer.toString(input%8);
//				input = input/8;				
//				Remain = Remain2 + Remain; // 문자열을 역순으로 붙여줌
//			}else if(input < 8) {
//				break;
//			}
//		}
		
		// for문을 사용해서
		
		for(int i = 0; i<1;) {
		if(input>=8) {
			Remain2 = Integer.toString(input%8);
			input = input/8;				
			Remain = Remain2 + Remain; // 문자열을 역순으로 붙여줌
		}else if(input < 8) {
			break;
		}
	}
		return Remain;
	}
}
