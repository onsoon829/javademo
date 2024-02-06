package java018_collection.part16;

import java.util.Comparator;
//오름차순 1, 3, 5, 2, 4, 1
public class Ascending implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		System.out.printf("%d $d => %d\n",o1, o2, o1.compareTo(o2));

		return o1.compareTo(o2);
	}

}
