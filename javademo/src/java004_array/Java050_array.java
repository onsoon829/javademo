package java004_array;

/*출력결과
1 2 3 4 5
10 9 8 7 6
11 12 13 14 15
20 19 18 17 16
*/
public class Java050_array {

	public static void main(String[] args) {
		int[][]num = {{1,2,3,4,5},
                      {6,7,8,9,10},
                      {11,12,13,14,15},
                      {16,17,18,19,20}};
		for(int row = 0; row < num.length; row++) {
			for(int col = 0; col < num[row].length; col++) {
				if(row % 2 == 1) {
					System.out.printf("%4d", num[row][num[row].length-1-col]);
				}else {
					System.out.printf("%4d", num[row][col]);
				}
			}
			System.out.println();
		}
        //col num[row].length -1 -0(col) = 4
		//col num[row].length -1 -1(col) = 3
		//col num[row].length -1 -2(col) = 2
		//col num[row].length -1 -3(col) = 1
		//col num[row].length -1 -4(col) = 0
		//-> length(길이) - col(열)(첫열부터 센다)(0,1,2,3,4) =
	}//end main

}//end class
