import java.util.Random;


public class dice {
	public static void main(String[] args) {
		
		//if���� Ȱ��
		Random diceCase = new Random();
		int diceStatus = diceCase.nextInt(6);
		
		System.out.println(diceStatus+1);
		
		if (diceStatus==0)
			System.out.println("�۸�");
		else if(diceStatus==1)
			System.out.println("�߿�");
		else if(diceStatus==2)
			System.out.println("3");
		else if(diceStatus==3)
			System.out.println("4");
		else if(diceStatus==4)
			System.out.println("5");
		else
			System.out.println("6");
		
		//case���� Ȱ��
//		Random diceCase = new Random();
//		int diceStatus = diceCase.nextInt(6);
//		
//		System.out.println(diceStatus+1);
//		
//		switch(diceStatus+1) {
//		case 1:
//			System.out.println("�۸�");
//		break;
//		case 2:
//			System.out.println("�߿�");
//		break;
//		case 3:
//			System.out.println("3");
//		break;
//		case 4:
//			System.out.println("4");
//		break;
//		case 5:
//			System.out.println("5");
//		break;
//		case 6:
//			System.out.println("6");
//		break;			
//		}
	}

}
