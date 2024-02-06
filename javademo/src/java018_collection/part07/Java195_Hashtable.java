package java018_collection.part07;

import java.util.Enumeration;
import java.util.Hashtable;

/*
 * Hashtable
 * 1 Map인터페이스 구현해놓은 클래스
 * 2 Map인터페이스를 구현해 놓은 클래스들은 key, value쌍으로 저장한다.
 * 3 value을 구현해주는 것은 key 이므로 key은 중복을 허용하지 않는다.
 * 
 */

public class Java195_Hashtable {
	public static void main(String[] args) {
	
		Hashtable<Integer,String> table = new Hashtable<Integer, String>();
		//table.put(key, value);
		table.put(10, "Java");
		table.put(20, "jsp");
		table.put(30, "spring");
		System.out.println(table.size());
		System.out.println(table.get(10));
		
		
		System.out.println("==========Enumeration===========");
		Enumeration<String> enu = table.elements();
		while(enu.hasMoreElements())
			System.out.println(enu.nextElement());
		
		System.out.println("======Enumeration ==keys()======");
		Enumeration<Integer> enuKey = table.keys();
		while(enuKey.hasMoreElements()) {
			int key = enuKey.nextElement();		
			System.out.printf("%d : %s\n" , key, table.get(key));
		}
	}// end main
}// end class
