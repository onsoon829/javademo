package java019_inner.part03;

public class OuterLocal {
	private int x;
	static private int y;
	final private int z = 10;
	
	public void call(int a) {//외부변수 a값을 InnerLocal에서 사용하려고 하면  final을 붙여서 사용?
		final int b=20;//값들 변경 불가.
		int c = 30;
		a =a+10; 
		System.out.println("a=" + a);
		
		class InnerLocal {
			void prn() {
				System.out.println("x=" + x);
				System.out.println("y=" + y);
				System.out.println("z=" + z);
				System.out.println("a=" + a);
				System.out.println("b=" + b);
				System.out.println("c=" + c);
			}//end prn()
		}//지역 내부 변수 end InnerLocal
		
		InnerLocal inner = new InnerLocal();
		inner.prn();
	}//end call

}//end OuterLocal
