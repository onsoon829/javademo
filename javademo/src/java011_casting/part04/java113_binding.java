package java011_casting.part04;

public class java113_binding {

	public static void main(String[] args) {
		LgTv lgTv = new LgTv("LG");
		process(lgTv);

		SamsungTv ssTv = new SamsungTv("SAMSUNG");
		process(ssTv);

	}// end main

	// 결합도(의존도)가 낮아졌다.
	public static void process(HomeTv tv) {
		tv.turnOff();
		tv.turnOn();
		tv.soundUp();
		tv.soundDown();

		if (tv instanceof LgTv) {
			LgTv lgTv = (LgTv) tv;
			lgTv.call();
		}

		if (tv instanceof SamsungTv) {
			SamsungTv ssTv = (SamsungTv) tv;
			ssTv.move();
		}

	}

}// end class
