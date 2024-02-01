package java013_api;

import static java.lang.Math.round;

public class Java142_Math {

	public static void main(String[] args) {
		double a = 25.367; //25.4
		double b = 268.35; //270
		
		long data = round(a);
		System.out.println(data);

//		System.out.println((double)round(a * 10)/ 10);
//		System.out.println(round(b/10) * 10);
		Math.round(b);
		
//		double val = (double)data/0.1;
//		System.out.println(val);
	}//end main

}//end class
