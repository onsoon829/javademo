package java019_inner.part05;

import java.awt.Frame;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


class WinTest_3 extends Frame{
	public WinTest_3(){
		setSize(500, 500);
		setVisible(true);
		//대상.addXXXListner(이벤트 객체)
		this.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});
}
	
	
	
}//end WinTest_1
class WinTest_3 extends Frame{
	public WinTest_3(){
		setSize(500, 500);
		setVisible(true);
		//대상.addXXXListner(이벤트 객체)
		this.addWindowListener(new WindowExit());
	}
	
}//end 
//내부 클래스
class AdapterExit extends WindowAdapter{
	@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
}
public class Win_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
