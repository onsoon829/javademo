package ncs;

public class test01 {

	public static void main(String[] args) {
		int[][]array = {{12, 41, 36, 56, 21},
				        {82,10, 12, 61, 45},
				        {14, 16, 18,78, 65}, 
				        {45,26, 72,23, 34}};
		double sum = 0;
		double avg = 0.0f;
		
		for(int col = 0; col< array.length; col++) {
			
			for(int row =0; row < array[col].length; row++) {
				sum += array[col][row];
			}
			avg = sum/20;
		}
        System.out.printf("합계: %4.2f\n", sum);
        System.out.printf("평균: %4.2f\n", avg);
	}//end main

}//end class
