
public class studyingFor {
	public static void main(String[] args) {
		//�ݺ���
//		for(int i = 0; i<4; i++) {
//			System.out.println("*");
//			for(int j = 0; j<4; j++) {
//				System.out.println(j);			
//			}
//		}
		int a= 0;
		while(true) {
			if ( a >100) {
				break;
			}
			System.out.println(a);
			a++;
		}
		
		for(int i = 0; i < 100; i++) {
			System.out.print("a");
			if(i == 98) {
				continue; // �ش� ȸ���� �ݺ��� �������� �ʰ� �������� �Ѿ
			}
			System.out.println(i);
		}
	}
}
