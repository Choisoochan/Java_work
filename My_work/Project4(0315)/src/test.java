
public class test {
	public static void main(String[] args) {
		
//		 형변환
		
		int a = 9999999;
		short b = 3;
		b = (short)a;
		System.out.println(b);
		
		short c = 10;
		int d;
		d = c;
		System.out.println(c);
		
//		 묵시적 형변환 (사칙연산 중 나눗셈 할 때는 캐스팅(형변환)을 꼭 해줘야 정확한 연산결과값을 얻을 수 있음)
		
		int number1 = 10;
		int number2 = 3;
		double resultNumber = (double)number1 / number2;
		System.out.println(resultNumber);
		
//		연산자
		
		int i = 10;
		System.out.println(i++);
		System.out.println(++i); //가독성이 떨어지는 코딩기법이니 지양하도록 하자
		
		int j = 10;
		j++;
		System.out.println(j);
		++j; //가독성이 떨어지는 코딩기법이니 지양하도록 하자
		System.out.println(j);
		
//		가독성을 위해 알고는 있되 표기를 해 두도록 하자
		
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
