package java012_api.part05;

import java.util.Arrays;

public class Java119_clone {

	public static void main(String[] args) {
		int[]arr = {1,2,3,4,5};
		//int[] copy = arr;//
		int[]copy = arr.clone();//최초의 int[]arr값을 복사해 간다. 
		                        //이후 int[]arr의 값을 바꿔도 최초의 값만 가져온다
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copy));
		arr[0] = 10;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copy));


	}

}
