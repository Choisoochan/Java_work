
public class O2 { // extends Object 와 동일
//	int name = 1;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		O2 obj2 = (O2)obj; // 특정한 변수와 비교하기 위해서는 이와같이 타입캐스팅을 해야한다.
//		if (this.name == obj2.name) {
//			return true;
//		}
		return true; // return this.name == obj2.name
	}
}
