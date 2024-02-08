package java019_inner.part05;

import java.awt.font;
import java.awt.Frame;
import java.awt.event.WindowListener;

class WinTest_1 extends Frame{
	public WinTest_1(){
		setSize(500, 500);
		setVisible(true);
		//대상.addXXXListner(이벤트 객체)
		this.addWindowListener(new WindowExit());
	}
	
	
	
}//end WinTest_1

class WindowExit implements WindowListener{
	@Override
	public void windowOpened(WindowEvent e) {
		
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		
	}
	
	@Override
	public void windowClosed(WindowEvent e) {
		
	}
	
	
}//end 

public class Win_1 {

	public static void main(String[] args) {
		new WinTest_1();
		

	}//end main

}//end class
