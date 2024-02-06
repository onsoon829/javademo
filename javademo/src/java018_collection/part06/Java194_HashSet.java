package java018_collection.part06;

import java.util.HashSet;

public class Java194_HashSet {

	public static void main(String[] args) {
		//HashSet: 중복허용 안되고, 출력 순서 유지 안된다.
		//그러니까 아래대로라면 10, 30, 20 이리 순서대로 출력이 안되고
		//원 순서와 다르게 출력이 된단 소리다.
		HashSet<Integer>set = new HashSet<Integer>();
			set.add(10);
			set.add(30);
			set.add(20);
			set.add(10);
			
			for(Integer it : set)
				System.out.println(it);
	}//end main

}///end class
