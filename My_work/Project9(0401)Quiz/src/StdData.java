import java.util.Scanner;

public class StdData {
	String name;
	int midTermExam;
	int finalExam;
	static int midTermExamTotal = 0;
	static int finalTermExamTotal = 0;
	static int examAvg = 0;
	
	public void inputStdData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 : ");
		this.name = scan.nextLine();
		
		System.out.println("중간 고사 : ");
		String tmp = scan.nextLine();
		this.midTermExam = Integer.parseInt(tmp);
		
		System.out.println("기간 고사 : ");
		tmp = scan.nextLine();
		this.finalExam = Integer.parseInt(tmp);
		
		
		
	}
	
	
}
