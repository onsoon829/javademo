package java008_static_access.part06;

import java008_static_access.part05.Java088_access;

public class Java090_access extends Java088_access{

	public static void main(String[] args) {
		//Java088_access p = new Java088_access();
		Java090_access p = new Java090_access();
		
	     //System.out.println("var_privat=%d\n", p.var_private);
	     //System.out.printf("var_default=%d\n", p.var_default);
	     System.out.printf("var_protected=%d\n", p.var_protected);
	     System.out.printf("var_public=%d\n", p.var_public);

	}//end main

}//end class
