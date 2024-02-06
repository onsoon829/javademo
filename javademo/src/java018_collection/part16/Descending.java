package java018_collection.part16;

import java.util.Comparator;

//내림차순 o2.compareTo(o1)
public class Descending implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		System.out.printf("%d %d =? %d\n", o1, o2, o2.compareTo(o1));
		return o2.compareTo(o1);
	}

}
