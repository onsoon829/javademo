package java015_exception;

public class Java162_exception {

	public static void main(String[] args) {
		String data1 = "8";
		String data2 = "0";
		//알파벳은 숫자로 변경 안된다(자료 타입이 다르므로)
		try {
			int x = Integer.parseInt(data1);
			int y = Integer.parseInt(data2);
			int res = x/y;
			System.out.println(res);
		}catch(ArithmeticException ex) {
			System.out.println(ex.toString());//exception이 발생했을 경우, 이를 처리하기 위한 문장을 넣는다,
		}catch(NumberFormatException ex) {
			System.out.println(ex.toString());
		}catch(RuntimeException ex) {
			System.out.println(ex.toString());
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}
		
		

	}//end main

}//end class
