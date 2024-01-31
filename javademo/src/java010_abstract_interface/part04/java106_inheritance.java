package java010_abstract_interface.part04;

/*
 * 인터페이스(interface)
 * 1. 추상메소드와 상수를 가지고 있는 형태이다.
 * 2. 클래스 작성에 도움을 주기 위한 목적으로 제공되는 표준명세서이다.
 * 3. implements  : 클래스에 인터페이스를 구현할 때 사용되는 키워드이다.
 * 4. 인터페이스는 접근제어자로 public만 제공한다.
 * 5. 인터페이스의 추상메소드에 abstract키워드를 명시하지 않아도 된다.
 *    자바가상머신(JVM)에서 자동으로 처리하기 때문에...
 * 6. 모든 인터페이스의 메소드는 묵시적으로 public abstract이다.
 * 7. 멤버변수는 묵시적으로 public static final이다.
 * 8. 객체 생성은 하지 못하지만, 참조형 타입으로서는 사용 가능하다.
 *     public static final int num = 10;   
 *     public abstract void prn();
 *     
 *             class           interface
 *  멤버변수       O                상수
 *  메소드     선언부+구현부         선언부(추상메소드)
 *  생성자        O                 X
 *  초기화블록     O                 X
 *  내부클래스     O                 O
 *  
 *  extends: 클래스에 클래스 상속(단일상속), 인터페이스에 인터페이스 상속(다중상속)
 *  implements: 클래스에 인터페스이스 구현(다중 구현)
 * 
 * 9. default메서드와 static 메서드 (jdk8 추가)
 * 	인터페이스의 기본이 추상메소드기 때문에, 부모클래스에서 메서드가 추가되면 자식 클래스에서 항상 오버라이드 해서 써야한다.	
 *	8버전 부터 default 메소드를 추가해서 부모클래스에서 default 메소드를 사용해서 구현부에 구현하면 자식클래스에서 오버라이드 하지 않아도 부모 클래스의 메소드를 사용 가능하다.
 * 	
  10. 인터페이스 장점
 *    1) 개발시간을 단축시켜준다.
 *    2) 표준화가 가능하다.
 *    3) 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다.
 *    4) 독립적인 프로그래밍이 가능하다.	  
 */
public class java106_inheritance {

	public static void main(String[] args) {
		// interface.method(
		CarRun.dispaly();
		// interface.variable
		System.out.println(CarRun.carCount);

		Truck truck = new Truck();
		truck.prn();
		truck.call();

	}// end main

}// end class
