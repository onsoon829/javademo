package java013_api;

import java.util.Scanner;
public class Java145_Scanner {

	public static void main(String[] args) {
		//콘솔창으로 데이터를 읽어오기 위해서 콘솔창과 연결
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름:");
		
		//next(), nextLine() 메소드를 만나면 대기상태가 되며
		//사용자가 데이터를 입력하고 Enter를 하면
		//next(), nextLine()메소드에서 읽는다.
		//String name = sc.next();// 콘솔창에 띄어쓰기해서 뭔가 또 써놓은 경우, 첫번째 것만 읽는다.
		String name = sc.nextLine();//콘솔창에 써놓은 것 다 읽어온다.
		System.out.println(name);
	}//end main

}//end class
