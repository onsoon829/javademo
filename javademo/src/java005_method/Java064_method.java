package java005_method;

/*
 * 출력결과
java test
tset avaj
java test
*/
public class Java064_method {

	public static void main(String[] args) {
		char[] arr = { 'j', 'a', 'v', 'a', ' ', 't', 'e', 's', 't' };
		System.out.println(arr);
		System.out.println(reverse(arr));
		System.out.println(arr);

	}//end main()

	public static char[] reverse(char[] data) {//data값 따로 배열을 만들어라.,.?
		//data의 요소 앞뒤를 바꿔서 리턴하는 프로그램 구현
	    //char[] data2  = {'t', 's', 'e', 't', ' ', 'a', 'v', 'a', 'j'};
		char[] alpha = new char[data.length];
		
		alpha[0] = data[8];
		alpha[1] = data[7];
		alpha[2] = data[6];
		alpha[3] = data[5];
		alpha[4] = data[4];
		alpha[5] = data[3];
		alpha[6] = data[2];
		alpha[7] = data[1];
		alpha[8] = data[0];
		
		for(int i = 0; i < alpha.length; i++) {
			alpha[i] = data[alpha.length -1 - i];
		}
		
		return alpha;
	}//end reverse()
}//end class
