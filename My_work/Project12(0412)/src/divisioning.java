import java.util.Scanner;

public class divisioning {
	public void division() {
		Scanner scan = new Scanner(System.in);
		System.out.println("나누고 싶은 두개의 숫자를 입력해주세요");
		int inputA = scan.nextInt();
		int inputB = scan.nextInt();
		float answer = (float)inputA / inputB;
			
		System.out.println("입력하신 숫자는 " + inputA + "와 " + inputB + "입니다.");
		System.out.printf("나눈 몫은" + "%.2f" + "입니다.", answer);
		System.out.println();
	}
}
