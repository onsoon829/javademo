package java020_thread.part02;

//Runnable interface에서는 run()메소드만 제공한다.
//implements: 부모는 선언만 하며, 반드시 자식이 정의를 오버라이딩해서 사용.
public class UserImp implements Runnable{
	@Override
	public void run(){
		//run메소드를 오버라이딩하여 스레드가 실행할 작업 정의.
		for(int i = 0; i <=5; i++)
			System.out.printf("%s i = %d\n", Thread.currentThread().getName(),i);
		
	}

}
