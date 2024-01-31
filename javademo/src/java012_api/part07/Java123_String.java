package java012_api.part07;

public class Java123_String {

	public static void main(String[] args) {
		String sn = "korea";
		char[]data = display(sn);
		System.out.println(data);
		System.out.println(sn);

	}//end main
	
	public static char[] display(String alpa) {
		//alpa매개변수에 저장된 문자열을 reverse한 후 반환하는 프로그램을 구현하시오.
//		char[] data = {'a', 'e', 'r', 'o', 'k'};
//		String sn = String.valueOf(data);
//		System.out.println(sn);
		
		char[]arr = new char[alpa.length()];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = alpa.charAt(alpa.length()-1-i);
		}
				
		
		
		return arr;
	}

}//eend class
