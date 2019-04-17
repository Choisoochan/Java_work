import java.util.Scanner;

public class StudentProfFin {
	String name;
	int midScore;
	int finScore;
	
	StudentProfFin(){
		
	}
	
	StudentProfFin(String name){
		this.name = name;
	}
	
	

	public void inputData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("중간고사점수입력");
		String tmp;
		tmp = scan.nextLine();
		this.midScore = Integer.parseInt(tmp);
		System.out.println("기말고사점수입력");
		tmp = scan.nextLine();
		this.finScore = Integer.parseInt(tmp);
				
	}
//	Override
	public String toString() {
		return this.name + "(중간고사 "+ this.midScore + ", 기말고사" + this.finScore + ")";
	}

}
