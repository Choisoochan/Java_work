
public class test {
	public static void main(String[] args) {
		
//		 ����ȯ
		
		int a = 9999999;
		short b = 3;
		b = (short)a;
		System.out.println(b);
		
		short c = 10;
		int d;
		d = c;
		System.out.println(c);
		
//		 ������ ����ȯ (��Ģ���� �� ������ �� ���� ĳ����(����ȯ)�� �� ����� ��Ȯ�� ���������� ���� �� ����)
		
		int number1 = 10;
		int number2 = 3;
		double resultNumber = (double)number1 / number2;
		System.out.println(resultNumber);
		
//		������
		
		int i = 10;
		System.out.println(i++);
		System.out.println(++i); //�������� �������� �ڵ�����̴� �����ϵ��� ����
		
		int j = 10;
		j++;
		System.out.println(j);
		++j; //�������� �������� �ڵ�����̴� �����ϵ��� ����
		System.out.println(j);
		
//		�������� ���� �˰�� �ֵ� ǥ�⸦ �� �ε��� ����
		
		int k = 3;
		int p = 10;
		int o;
		int u;
		o = k+p*4;
		u = k+(p*5);
		
		System.out.println(o);
		System.out.println(u);
		
	}
}
