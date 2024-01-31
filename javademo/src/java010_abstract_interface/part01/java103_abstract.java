package java010_abstract_interface.part01;

/*
 * 클래스 종류 : 클래스, 추상클래스, 인터페이스
 * 메소드 정의 : 메소드 선언부 + 메소드 구현부
 * public void prn() { }
 * 
 * 추상메소드 : 선언부만 정의된 메소드이다.
 *  public abstract  void prn();
 *  
 * 추상클래스 : 추상메소드를 가지고 있는 클래스이다.
 * abstract public class Test{ 
 *    abstract public void prn();
 *   } 
 *   
 * 추상클래스 제공 목적 : 추상메소드를 강제적으로 오버라이딩하고 객체 생성을 할 수 없도록 하기 위해서이다.   
 */

public class java103_abstract {

	public static void main(String[] args) {
		//Cannot instantiate the type CarAbs
		//CarAbs carAbs = new CarAbs() 추상클래스라서 안됨

		TruckAbs truckAbs = new TruckAbs();
		truckAbs.work();
		
		SenndaAbs sennAbs = new SenndaAbs();
		sennAbs.work();
		
		
	}// end main

}// end class
