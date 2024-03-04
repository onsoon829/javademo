package java022_lambda.prob.part03;

/*배열 항목 중에 최대값 또는 최소값을 찾는 코드입니다. maxOrMin( ) 메소드를 호출할
때 빈 곳에 람다식을 작성하시요. 단 문제를 풀대 main()메소드의 주석을 해제한다.
 * [실행결과]
 * 최대값: 50
 * 최소값: 3
 */
public class Example {

	private static int[] scores = { 10, 50, 3 };

	public static int maxOrMin(Operator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.apply(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		// 최대값 얻기
		// int max = maxOrMin();
		// System.out.println("최대값: " + max);
		// 최소값 얻기
		// int min = maxOrMin();
		// System.out.println("최소값: " + min);
	}
}
