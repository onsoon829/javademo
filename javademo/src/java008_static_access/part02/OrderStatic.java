package java008_static_access.part02;
//class 클래스명{
//	맴버변수;
//	static {}
//	생성자()
//	메소드()
//}
public class OrderStatic{
	int x;//객체 멤버변수
	static int y;// 클래스 멤버변수
	static {
		y = 5;
		
		System.out.println("static");
		System.out.println("y=" + y);
	}
	
	public OrderStatic() {
		x = 10;
		System.out.println("constructor");
		System.out.println("x=" + x);
	}
	
	public void display() {
		System.out.println("display");
	}
	
}//end class