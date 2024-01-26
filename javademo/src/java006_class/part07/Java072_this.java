package java006_class.part07;

public class Java072_this {

	public static void main(String[] args) {
		Product pn = new Product("s001", "공산품", 4000);
		pn.display();
		
		Product ps = new Product(); //1
		ps.display();

	}//end main()

}//end class
