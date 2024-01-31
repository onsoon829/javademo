package java010_abstract_interface.part07;

public class UserFinal extends FinalTest{
	public UserFinal() {
		
	}

	@Override
	void display() {
		System.out.println("UserFinal display");
	}
	
	/*void process() {}
	 *Cannot override the final method from FinalTest
	 *final이 선언된 메서드는 오버라이드 불가
	 */

}// end class
