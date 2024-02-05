package java017_collection.part09;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

//Enumeration은 Vector와 Hashtable에서만 제공이 되는 인터페이스이다.
public class Java187_ArrayList {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		System.out.println("=================일반 for ===============");
		for(int i = 0; i < v.size(); i++)
			System.out.println(v.get(i));
		
		System.out.println("============Enumeration================");//열거
		//열거형
		Enumeration<Integer> enu = v.elements();
		while(enu.hasMoreElements())
			System.out.println(enu.nextElement());
		//System.out.println(enu.nextElement());
		
		System.out.println("===================Iterator==============");
		//반복자 v1.2
		Iterator<Integer> ite = v.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("===========개선된 루프=====================");
		for(Integer ig : v)
			System.out.println(ig);//헐 그렇구만 간단 그 자체

		

	}//end main

}//end class
