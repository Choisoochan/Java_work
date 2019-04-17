import java.util.Scanner;

public class MoneyBox {
	
	public int totalCoin = 0;
	private String name; // 외부에서 접근을 막기위해 private로 선언
	
//	public void setName(String name) {
//		this.name = name; //this : 나의 속성값에 접근할 때 사용
//	}

	public void doposit() {
		Scanner scan = new Scanner(System.in);
		System.out.println("돈을 넣어주세요, 필요하다면 메세지를 남겨주세요.");
		int inputCoin = scan.nextInt();
		String inputMessage = scan.nextLine();

		totalCoin = totalCoin + inputCoin;
		
		if(inputMessage.equals(null)) {
			System.out.println("딸그랑 ~ 입금하신 금액은 " + totalCoin + "원 입니다.");
		}else if(inputMessage == "crash"){
			System.out.println("모인 금액은 " + totalCoin + "원 입니다.");
		}
		else{
			System.out.println(inputMessage +" 입금하신 금액은 " + totalCoin + "원 입니다.");
		}
		
		

		
	}
	
	public void withdraw() {
		System.out.println(name + "출금액 : " + totalCoin);
		totalCoin = 0;
	}
}
