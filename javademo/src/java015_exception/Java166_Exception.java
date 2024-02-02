package java015_exception;

public class Java166_Exception {

	public static void main(String[] args) {
		int data = 14;                             ;
		
		try {
			if(data < 10) {
				//throw: 강제적으로 예외를 발생시킬때 사용한다.
				throw new UserException("10이상만 입력하세요.");//개발자가 고의로 예외발생할때 throw
			}System.err.println(data);
		    }catch(UserException ex) {
			    System.out.println(ex.getMessage());
		}

	}//end main

}//end class
