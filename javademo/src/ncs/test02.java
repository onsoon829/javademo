package ncs;

public class test02 {

	public static void main(String[] args) {
		String str = "1.22, 4.12, 5.93, 8.71, 9.34";
		double data[] = new double[5];
		double sum = 0;
		double avg = 0;
		//str에서 데이터를 분리한다.
		String[]st;
		data[0] = 1.22;
		data[1] = 4.12;
		data[2] = 5.93;
		data[3] = 8.71;
		data[4] = 9.34;
		
		sum =(data[0]+data[1]+data[2]+data[3]+data[4]);
		avg = sum/5;
		System.out.printf("합계: %.3f\n", sum);
		System.out.println("평균: " + avg);
				
		

	}//end main

}//end class
