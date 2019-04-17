import java.util.Scanner;

public class DataPractice {
	String name;
	int midTermScore;
	int finalScore;
	
	DataPractice(){

	}
	
	DataPractice(String name){
		this.name = name;
	}
	
	
	
	public void inputData() {
		Scanner scan = new Scanner(System.in);
		System.out.print("중간고사 점수 : ");
		String tmp = scan.nextLine();
		this.midTermScore = Integer.parseInt(tmp);
		System.out.print("기말고사 점수 : ");
		tmp = scan.nextLine();
		this.finalScore = Integer.parseInt(tmp);
	}
	
	public String toString() {
		return this.name + "(중간고사" + this.midTermScore + ", 기말고사" + this.finalScore + ")";
	}
}
