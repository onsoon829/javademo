package java018_collection.part02;

import java.util.ArrayList;
import java.util.ListIterator;

public class Java189_LinkedList {

	public static void main(String[] args) {
		System.out.println("========ArrayList============");
		ArrayList<String> aList = new ArrayList<String>();
		aList.add(new String("java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		
		ListIterator<String>ank=aList.listIterator();
		
		System.out.println(ank.previous());

	}//end main

}//end class