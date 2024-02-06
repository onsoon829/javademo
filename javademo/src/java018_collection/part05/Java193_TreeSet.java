package java018_collection.part05;

import java.util.Iterator;
import java.util.TreeSet;

public class Java193_TreeSet {

	public static void main(String[] args) {
		//TreeSet: Tree(오름차순 정렬된 위치에 저장하므로 저장순서 유지 x), 
		//Set(중복 안됨)
		TreeSet<Integer>tree = new TreeSet<>();
		tree.add(300);
		tree.add(100);
		tree.add(200);
		tree.add(100);
		
		System.out.println(tree.size());
		for(int it : tree)
			System.out.println(it);
		System.out.println(tree.size());
		
//		System.out.println(tree.pollFirst()); //Remove하면서 가져옴
//		System.out.println(tree.pollLast());//Remove하면서 가져옴
		System.out.println(tree.size());
		
		//Iterator: 저장된 각 요소에 접근하는 기능
		Iterator<Integer>ita = tree.iterator();
		while(ita.hasNext())
			System.out.println(ita.next());
		
		System.out.println("==============내림차순=========");
		Iterator<Integer>ite = tree.descendingIterator();
		while(ite.hasNext())
			System.out.println(ite.next());

	}//end main

}//end class
