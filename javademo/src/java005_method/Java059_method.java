package java005_method;

public class Java059_method {

	public static void main(String[] args) {
		//조건: data변수에 소문자만 입력
		char data = 'd';
        char code = process(data);
        System.out.printf("%c의 대문자는 %c입니다.\n", data, code);
	}//end main()
	
	// data 매개변수의 값을 대문자로 변경해서 리턴
	public static char process(char data) {
		//1. 대문자 A, 소문자 a의 유니코드: 65, 97
		//2, 대문자와 소문자의 차이: 32
		//3. int이하의 데이터 타입끼리 연산이 되면 결과는 int로 리턴
		return (char)(data - 32);
	}//end process()

}//end class
