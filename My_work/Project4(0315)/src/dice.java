import java.util.Random;


public class dice {
	public static void main(String[] args) {
		
		//if문을 활용
//		Random diceCase = new Random();
//		int diceStatus = diceCase.nextInt(100);
//		diceStatus = diceStatus%6;
//		diceStatus = diceStatus + 1;
//		System.out.println(diceStatus);
//		
//		if (diceStatus==1)
//			System.out.println("멍멍");
//		else if(diceStatus==2)
//			System.out.println("야옹");
//		else
//			System.out.println(diceStatus);
		
		//case문을 활용
		Random diceCase = new Random();
		int diceStatus = diceCase.nextInt(6)+1;
		
		System.out.println(diceStatus);
		
		switch(diceStatus) {
		case 1:
			System.out.println("멍멍");
			break;
		case 2:
			System.out.println("야옹");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
			break;
		default:
			System.out.println("6");		
		}
		
		// **break를 삭제하면 break를 만날 때 까지 모든 케이스를 작동함. 해당 특성을 이용하여 코딩하여도 무방하나
		// 추천하지않는방법중 하나라고 함. 오동작의 우려가 있음.
	}

}
