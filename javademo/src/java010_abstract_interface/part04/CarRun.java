package java010_abstract_interface.part04;

public interface CarRun {

	int carCount = 5; // public static final 자동으로 붙여서 처리 됨
	
	// public carRun() {}
	// static {}
	void prn(); // public abstract 자동으로 붙여서 처리 됨

	class Sun {
		public Sun() {
			System.out.println("Sun Constroctor");
		}
	}
	
	// java8부터 사용 가능한 dafault method
	default void call ( ) {
		System.out.println("CarRun call");
	}
	
	//java8부터 사용 가능한 static method
	static void dispaly() {
		System.out.println("display");
	}

}
