package java004_array;

public class Java040_array {

	public static void main(String[] args) {
		int[] data = {10, 20, 30};
		//초기값을 할당하면서 배열 생성할 때에는 배열의 크기를 지정할 수 없다.
		int[] jumsu = new int[] {90,80,40};
		
		for(int i = 0; i<jumsu.length;i++) {
			System.out.printf("%4d\n", jumsu[i]);
		}
		
		System.out.printf("%4d\n", jumsu[2]);
		System.out.printf("%4d\n", jumsu[1]);
		System.out.printf("%4d\n", jumsu[0]);
		
		for(int i = 2; i >= 0; i--) {
			System.out.printf("%4d\n", jumsu[i]);
		}

	}//end main

}//end class
