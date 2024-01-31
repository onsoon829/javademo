package java010_abstract_interface.part03;

public class java105_abstract {
	public static void main(String[] args) {

		Piano piano = new Piano("Piano");
		System.out.println(piano.name);
		piano.play();

		
		Flute flute = new Flute("Flute");
		System.out.println(flute.name);
		flute.play();
		
		
	}// end main
}// end class
