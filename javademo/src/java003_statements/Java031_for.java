package java003_statements;
/*
 * 3의 배수만 제외하는 프로그램 구현
 * 1
 * 2
 * 4
 * 5
 * 7
 * 8
 * 10
 */
public class Java031_for {

	public static void main(String[] args) {
		for (int x = 1; x <= 10 ; x++) {
			/*
			 * if(x % 3 != 0) { //3의 배수가 아니라면(3으로 나눈 나머지가 0이 아니라면))
			 * System.out.printf("%d\n", x); }
			 */
			if(x % 3 ==0) {
				continue;//반복문에서 continue를 만나면 증감식으로 갔다가 조건식으로 간다.
			}
			System.out.printf("%d\n", x);
		}

	}//end main

}//end class
