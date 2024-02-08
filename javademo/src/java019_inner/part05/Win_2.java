package java019_inner.part05;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



	class WinTest_2 extends Frame{
		public WinTest_2(){
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
	public static void main(String[] args) {
		new WinTest_2();
	}

}
