package java018_collection.part16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java204_Sort {
	
	public static void main(String[] args) {
		
	Integer[] arr =new Integer[] {1,3,5,2,4,1};
//	Arrays.sort(arr); //배열에 담겨진 애들 정리할때 (오름차순)
//	for(Integer it:arr)
//		System.out.println(it);
		
	List<Integer> ast = Arrays.asList(arr); //배열 타입을 리스트로 바꿔줌
	ArrayList<Integer> aList = new ArrayList<Integer>(ast);
	System.out.println(aList.toString());
			
	System.out.println("===========오름차순============");
	aList.sort(new Ascending());
	System.out.println(aList.toString());
		
	
	System.out.println("===========내림차순============");
	aList.sort(new Descending());
	System.out.println(aList.toString());
	}// end main
	
}// end class
