
public abstract class Figure {
	String name = "도형 넓이 구하기";
	int selectNum=0;
	int side1=0;
	int side2=0;
	int height=0;
	double area=0;
	
	public abstract void inputValue();
	
	public void printResult() {
		System.out.println(this.name);
	}
}
