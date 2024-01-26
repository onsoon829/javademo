package java005_method;

public class Java065_method {

	public static void main(String[] args) {
		char[] data = {'a', 'b', 'c'};
		
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
		}
		System.out.println();
		
		System.out.println(data);// abc
		
		System.out.println(data+"\n");//주소값 출력->[C@36baf30c
		System.out.printf("%s\n", data);//[C@36baf30c
		
		int[] num = {1,2,3};
		System.out.println(num); // [I@77459877
		
	}//end main()

}//end main()
