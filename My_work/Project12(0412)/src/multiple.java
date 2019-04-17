import java.util.Scanner;

public class multiple {
	public void multipling() {
		Scanner scan = new Scanner(System.in);
		System.out.println("곱하고 싶은 두개의 숫자를 입력해주세요");
		int inputA = scan.nextInt();
		int inputB = scan.nextInt();
		int answer = inputA * inputB;
		
		System.out.println("입력하신 숫자는 " + inputA + "와 " + inputB + "입니다.");
		System.out.println("곱은 " + answer + "입니다.");
		System.out.println();
	}

}
