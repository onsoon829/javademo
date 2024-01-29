package java007_class.Part05;
/*
 * [출력결과]
 * 기업은행 42523-52325 100000
 * 하나은행 52253-22623 153000
 * 신한은행 16239-95235 256000
 * 총납입액:509000
 */
public class Java079_class {

	public static void main(String[] args) {
		// 출력결과를 잠조하여 main메서도를 구현하세요
     Craeditcard[]cc = null;
     cc = new Craeditcard[3];
     cc[0] = new Craeditcard("기업은행", "42523-52325", 100000);
     cc[1] = new Craeditcard("하나은행", "52253-22623", 153000);
     cc[2] = new Craeditcard("신한은행", "162239-95235", 256000);
     process(cc);
	}//end main
public static void process(Craeditcard[]cc) {
	int sum = 0;
	for(int i = 0; i < cc.length; i++) {
		sum += cc[i].pay;
		System.out.println(cc[i].toString());
	}
	

}//end main
}//end class
