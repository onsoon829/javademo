package java004_array;

public class Java046_array {

	public static void main(String[] args) {
		// 3행 2열의 배열
		// int[][] num = {{1,2},{3,4},{5,6}};
		int[][]num = new int[][] {{1,2},// new int[][] 생략 가능
			                      {3,4},
			                      {5,6}};
		
		for(int row=0; row<num[row].length; row++) {
			for(int col =0; col<num[row].length;col++) {
				System.out.printf("4%d", num[row][col]);	
			}
			System.out.println();		
		}
		/*
		 * 1 3 5 
		 * 2 4 6
		 */
//		System.out.printf("4%d", num[0][0]);
//		System.out.printf("4%d", num[1][0]);
//		System.out.printf("4%d", num[2][0]);
//		System.out.println();
//		System.out.printf("4%d", num[0][1]);
//		System.out.printf("4%d", num[1][1]);
//		System.out.printf("4%d", num[2][1]);
		int col = 0;
		int row = 0;
		for(col = 0; col < num[row].length; col++) {
			for(row =0; row <num.length; row++) {
				System.out.printf("4%d", num[row][col]);
			}
			System.out.println();
		}
		
	}//end main

}//end class
