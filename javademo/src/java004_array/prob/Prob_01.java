package java004_array.prob;

/*
 * num배열에서 최대값을 출력하는 프로그램을 구현하시오.
 * [출력결과]
 * 최대값:95
 */

public class Prob_01 {
	public static void main(String[] args) {

		int[] num = { 94, 85, 95, 88, 90 };
		
		//여기를 구현하세요.
        for(int i = 0; i < num.length; i++) {
            if(i == 2) {
        	System.out.printf("최대값: %d", num[i]);
            }
        }
        
	}// end main()

}// end class
