package java005_method;

public class Java057_method {

	public static void main(String[] args) {
//		int a = 4;
//		int b = 2;
//		int c = 5;
		
		int a = 4, b = 2, c = 5; //타입이 같으면 이렇게 한꺼번에 묶어도 된다.
		System.out.println(process(a,b,c));
		
		int[] num = {2, 3};
		System.out.println(plus(num)); //주소 복사
		
		int[] data = {2,6,2,8};
		System.out.println(plus(data));

	}// end main()

	public static int process(int x, int y, int z) {//위의 a, b,c 값복사 일어난다.
		return x+y+z;
	}//end process()
	
	public static int plus(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
			sum = sum + arr[i];
		return 0;
	}//end plus()
	
}//end class
