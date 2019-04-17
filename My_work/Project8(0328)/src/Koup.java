import java.util.Scanner;

public class Koup {
	public double userTall;
	public double userWeight;
	public double calKoup;
	public void UserDataInput() {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("키를 입력해주세요.(단위cm)");
		this.userTall = scan.nextDouble();
		
		System.out.println("몸무게를 입력해주세요.(단위kg)");
		this.userWeight = scan.nextDouble();
		
		System.out.println("키 : " + this.userTall + " / 몸무게 : " + this.userWeight);

	}
	public void CalculateKoup() {
		this.calKoup = (double)(this.userWeight*10000) / (this.userTall*this.userTall);
		System.out.println("카우프지수는 " + this.calKoup);
		if(this.calKoup>30) {
			System.out.println("비만 입니다.");
		}else if (this.calKoup>24 && this.calKoup<=29) {
			System.out.println("과체중 입니다.");
		}else if (this.calKoup>20 && this.calKoup<=24) {
			System.out.println("정상 입니다.");
		}else if (this.calKoup>15 && this.calKoup<=20) {
			System.out.println("저체중 입니다.");
		}else if (this.calKoup>13 && this.calKoup<=15) {
			System.out.println("여윔");
		}else if (this.calKoup>10 && this.calKoup<=13) {
			System.out.println("영양실조증");
		}else {
			System.out.println("소모증");
		}
	}
}
