package java010_abstract_interface.part05;

public class Life extends Animal implements SampleA, SampleB { //클래스,인터페이스 다중 상속시 순서는 클래스 > 인터페이스 순으로 되어야 한다.
	public Life() {

	}

	@Override
	public void prn() {
		System.out.println("prn");
	}

	@Override
	public void call() {
		System.out.println("call");
	}

}// end class
