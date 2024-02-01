package java012_api.part08;

public class Java134_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");
		System.out.println(sb);
		System.out.println(sb.toString());
		
		sb.insert(4, "jsp");
		System.out.println(sb);//javajsp test
		
		sb.delete(4,8);
		System.out.println(sb); //java test
		
		sb.delete(4,7);
		System.out.println(sb);// tset avaj
		
		sb.reverse();
		System.out.println(sb);// tset avaj
		
		//String -> StringBuffer -> reverse()
		String data = "mybatis orm";
		StringBuffer sf = new StringBuffer(data);
		sf.reverse();
		System.out.println(sf);
		String ss =sf.toString();
		System.out.println(ss);
		
		char[]arr = {'k', 'o', 'r', 'e', 'a'};
		StringBuffer sk = new StringBuffer(new String(arr));
		System.out.println(sk.reverse());
		
		StringBuffer se = new StringBuffer(String.valueOf(arr));
		System.out.println(se.reverse());
		
		//StringBuffer - > String -> char[]
		String sp = se.toString();
		char[] val = sp.toCharArray();
		System.out.println(val);
		
		System.out.println(se.toString().toCharArray());
		
		
		
	}//end main

}//end class
