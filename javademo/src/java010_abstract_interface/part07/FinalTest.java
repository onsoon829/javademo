package java010_abstract_interface.part07;

public class FinalTest {
	//final이 선언된 변수는 대문자를 사용하고 초기값을 할당해야한다.
	
	final int CODE = 1;
	
	public FinalTest() {
		//CODE=2;  / 상수에는 새로운 값을 할당할 수 없다.
		//The final field FinalTest.CODE cannot be assigned
	}
	
	void display() {
		System.out.println("FinalTest display");
	}

	final void process() {
		System.out.println("finalTest process");
	}


}// end class



