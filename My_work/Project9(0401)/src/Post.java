import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Post {
	String title;
	String description;
	String createDate;
	
	public void insertPost() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("제목");
		this.title = scan.nextLine();
		System.out.println("내용");
		this.description = scan.nextLine();
		
		long time = System.currentTimeMillis(); // 생성일자 추가해주는 거 외우지말고 검사하자
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		this.createDate= dayTime.format(new Date(time));
		
		
	}
}
