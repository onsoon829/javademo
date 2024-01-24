package java004_array;

public class Java045_array {

	public static void main(String[] args) {
		// 2차원 배열
		
		//3행 2열의 2차원 배열
		int[][] num = new int[3][2];
		
		System.out.printf("num[%d][%d]=%d\t", 0,0, num[0][0]); // 0행 0열에 있는 거 가져와라
		System.out.printf("num[%d][%d]=%d\n", 0,1, num[0][1]); // 0행 1열에 있는 거 가져와라
		
		System.out.printf("num[%d][%d]=%d\t", 1,0, num[1][0]); // 1행 0열에 있는 거 가져와라
		System.out.printf("num[%d][%d]=%d\n", 1,1, num[1][1]); // 1행 1열에 있는 거 가져와라
		
		System.out.printf("num[%d][%d]=%d\t", 2,0, num[2][0]); // 2행 0열에 있는 거 가져와라
		System.out.printf("num[%d][%d]=%d\n", 2,1, num[2][1]); // 2행 1열에 있는 거 가져와라
		System.out.println("================================================");
        
		num[0][0] = 1; // num배열에서 0행0열에 1을 저장
		num[0][1] = 2; // num배열에서 0행1열에 2을 저장
		num[1][0] = 3; // num배열에서 1행0열에 3을 저장
		num[1][1] = 4; // num배열에서 1행1열에 4을 저장
		num[2][0] = 5; // num배열에서 2행0열에 5을 저장
		num[2][1] = 6; // num배열에서 2행1열에 6을 저장
		
		System.out.printf("num[%d][%d]=%d\t", 0,0, num[0][0]); // 0행 0열에 있는 거 가져와라
		System.out.printf("num[%d][%d]=%d\n", 0,1, num[0][1]); // 0행 1열에 있는 거 가져와라
		
		System.out.printf("num[%d][%d]=%d\t", 1,0, num[1][0]); // 1행 0열에 있는 거 가져와라
		System.out.printf("num[%d][%d]=%d\n", 1,1, num[1][1]); // 1행 1열에 있는 거 가져와라
		
		System.out.printf("num[%d][%d]=%d\t", 2,0, num[2][0]); // 2행 0열에 있는 거 가져와라
		System.out.printf("num[%d][%d]=%d\n", 2,1, num[2][1]); // 2행 1열에 있는 거 가져와라
		System.out.println("================================================");
        
		for(int row = 0; row < num.length; row++) {
			for(int col=0; col < num[row].length; col++) {
			System.out.printf("num[%d][%d]=%d\t", row,col, num[row][col]);
			System.out.println(col != num[row].length-1 ? '\t' : '\n'); // col == 1
			}
			System.out.println();
		}
		
		
	}//end main

}//end class
