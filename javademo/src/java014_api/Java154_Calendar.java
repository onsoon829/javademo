package java014_api;

import java.text.SimpleDateFormat;

import javax.swing.text.SimpleAttributeSet;

public class Java154_Calendar {

	public static void main(String[] args) {
		// 하루는 86400초이다
		System.out.println(60 * 60 * 24);
		
		//currentTimeMillis() : 1970.1.1부터 초단위로
		//누적한 값을 밀리세컨드 리턴한다.
		//밀리초(millisecond, ms)는 천분의 1초(1/1000)를 의미한다
		long curr = System.currentTimeMillis();
		System.out.println(curr);
		//HH: 24시간 표현
		//hh: 12시간 표현
		//a: 오전 오후 표현
		//EEEE: 금요일
		//EEE: 금(뒤에 요일 안붙이고 출력)
		String pattern = "yyyy-MM-dd HH:mm:ss a EEEE";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		//auto boxing  up-casting
		//long -> long -> Object
		String dateTime = sdf.format(curr);
		System.out.println(dateTime);

	}//end main

}//end class
