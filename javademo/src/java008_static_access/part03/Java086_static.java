package java008_static_access.part03;

public class Java086_static {
    int x = 5;
    static int y = 10;
    
	public static void main(String[] args) {
		System.out.println("main");
		//non-static 자원은 static 메소드에서 호출할 수 없다.
		//process;
		display();
		
		Java086_static js = new Java086_static();
        js.process();
	}//end main

	public void process() {//뭔 개소리인지 모르겠다
		System.out.println("process");
		System.out.println("x=" + x);
		System.out.println("y=" + y);//(값 호출은 안되지만)오류는 안난다.
	}//end process
	
	public static void display() {
		System.out.println("display");
		//non-static 자원은 static 메소드에서 호출할 수 없다.
		//System.out.println("x=" + x);
		System.out.println("y=" + y);
	}//end display
}//end class 
