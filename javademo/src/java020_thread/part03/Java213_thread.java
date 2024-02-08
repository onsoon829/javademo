package java020_thread.part03;

public class Java213_thread {

	public static void main(String[] args) {
		LifeCycle cc = new LifeCycle();
		//System.out.println(cc.getState());// New상태값으로 나온다.
		System.out.printf("%s %s %d\n", cc.getName(), cc.getState(), cc.isAlive());
		cc.start();
		
		try {
			//cc작업스레드가 종료될 때가지 main스레드는 대기하고 있다.
		cc.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		//소멸된 상태값을 알아보기 위해서
	    System.out.printf("%s %s %d\n", cc.getName(), cc.getState(), cc.isAlive());
		System.out.println("main end");

	}//end main

}//end class
