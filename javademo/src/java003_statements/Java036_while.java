package java003_statements;
/*
 * while(조건식){// 조건식만 있다
 *    반복 수행 문장;
 * }
 * 
 * while문은 조건식을 생략할 수 없다.
 */
public class Java036_while {

	public static void main(String[] args) {
//	 for(int i = 1; i <= 5; i++) {
//		 System.out.println(i);
//		 //-> while문으로 바꿔보자
//	 }
		int i  = 1; //변수 선언
		while(i <= 5) {// 조건식
			//System.out.println(i); //수행될 문장
			//i++;//증감식
			//while문 쓰는 순서가 요렇게 된다.
			//System.out.println(i++);
			System.out.println(i);
		}
	 
	}//end main()

}//end class
