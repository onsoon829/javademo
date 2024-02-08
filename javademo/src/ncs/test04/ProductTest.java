package ncs.test04;

public class ProductTest {

	public static void main(String[] args) {
		Product m1 = new Product();
		m1.name = "갤럭시 s7";
		m1.price = 563500;
		m1.cnt = 3;
		m1.display();
		
		int total = m1.count();
//Scanner 사용
	}//end main

}//end class
