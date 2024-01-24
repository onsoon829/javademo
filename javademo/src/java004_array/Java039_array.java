package java004_array;

public class Java039_array {

	public static void main(String[] args) {
		//서로 다른 타입의 자료는 묶을 수 없다.
		int ko = 90;
		int en = 80;
		int jp = 40;
		
		int[] arr; // int arr[] 배열 선언
		//new 키워드를 이용해서 배열 생성
		//각 요소(element)마다 인덱스(index)가 0부터 생성된다.
		arr = new int[3]; //배열 생성한다 = 저장공간 생성한다
		//생성하면 인덱스 생성된다..
		
		//int[] arr = new int[3]; : 선언과 출력을 한번에 할 수도 있다.
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		arr[0] = 90;
		arr[1] = 80;
		arr[2] = 40;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println("배열의 크기:" + arr.length);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}//end main

}//end class
