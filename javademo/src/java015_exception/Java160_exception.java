package java015_exception;


public class Java160_exception {

	public static void main(String[] args) {
		int[]num = new int[3];
		num[0] = 10;
		System.out.println(num[0]);
		
		//오류 유형
		
		//인덱스의 범위를 벗어날 때 오류 발생
		try {
			num[4] = 20;
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}

	}//end main

}//end class
