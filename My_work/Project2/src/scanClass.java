import java.util.Scanner;

public class scanClass {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		//스캐너함수를 통해 변수 값 입력받기
		
		System.out.println("화면에 1번째 정수형 숫자를 입력해 주세요!");
		int intType1 = s.nextInt();
		System.out.print("당신이 입력한 숫자는 : ");
		System.out.println(intType1);	
		System.out.println('\t');
		System.out.println("화면에 2번째 정수형 숫자를 입력해주세요!");
		int intType2 = s.nextInt();
		System.out.print("당신이 입력한 숫자는 : ");
		System.out.println(intType2);
		System.out.println('\t');
		
		//입력받은 변수 값을 다양한 형태로 적용
		
		System.out.print("첫번째 입력값과 10의 합은 '");
		System.out.print(intType1+10);
		System.out.println("'입니다.");	
		
		System.out.print("두 숫자의 합은 '");
		System.out.print(intType1+intType2);
		System.out.println("'입니다.");
		
		System.out.print("두 숫자의 곱은 '");
		System.out.print(intType1*intType2);
		System.out.print("'입니다.");
		
		
	}

}
