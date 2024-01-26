package java006_class.part04;

public class Java069_class {

	public static void main(String[] args) {
		//1) 객체참조변수 선언
		//2) new로 객체생성(heap영역에 메모리 확보)
		//3) 생성자를 호출해서 heap에 있는 멤버변수의 초기값 할당
		//3-1) 생성자를 통해서 멤버변수에 초기값을 할당하지 않으면 자바가상머신(JVM)에서 자동으로 멤버변수에 기본값을 할당
		//4) 객체참조변수를 통해서 heap에 있는 자원(멤버변수)을 호출할 수 있다.
		// 객체참조변수를 통해서 method영역에 있는 자원(메소드)을 호출할 수 있다.
		//메소드는 지역변수이기 때문에 stack 지역에 저장된다.
		MenuShop m1 = new MenuShop();
		m1.menu = "떡볶이";
		m1.price = 2000;
		m1.cnt = 3;
		m1. display();
		
		MenuShop m2 = new MenuShop();
		m2.menu = "김말이";
		m2.price = 500;
		m2.cnt = 2;
		m2.display();
		
		MenuShop m3 = new MenuShop();
		m3.menu = "오뎅";
		m3.price = 3000;
		m3.cnt = 4;
		m3.display();
		
		int total = m1.count() + m2.count() + m3.count();
		System.out.println("총 주문금액:" + total);
		
		//클래스 생성하고 값 할당?
		//각각 클래스 생성하면 너무 많아서 클래
		//

	}

}
