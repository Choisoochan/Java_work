
public class MoneyBoxProf {
	private int coin;
//	public void deposit(int coin) { 두가지 모두 사용이 가능
//		this.coin = this.coin + coin;
//	}
	public void deposit(int coin, String message) {
		this.coin = this.coin + coin;
		if (message.contentEquals("")) {
			System.out.println("땡그랑~");
		}else {
			System.out.println(message);
		}
		
	}
	public void crash() {
		System.out.println("전체 코인" + coin + "이 출금되었습니다.");
		this.coin = 0;
	}
}
