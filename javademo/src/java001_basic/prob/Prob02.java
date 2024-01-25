package java001_basic.prob;

/*
 * num변수의 절대값을 출력하는 프로그램을 구현하시오.
 * [실행결과]
 * 10
 */
// 절대값: 실수난 복소수가 원점으로부터 떨어진 거리를 나타내는 음이 아닌 실수
// 쉽게 말하면 음수가 아닌 값.
public class Prob02 {

	public static void main(String[] args) {
		int num = -10;
		//여기에 작성하시오.
		int res ;
		res = (num <= 0) ? num*-1 : num;
		System.out.println(res);
		
		int a = (num <= 0) ? num*-1 : num;
		System.out.println(res);
		
		int b = (num <= 0) ? num : num * -1;
		System.out.println(res);
		//이런 식으로 여러 방법으로 나타낼 수 있다.
	}

}
