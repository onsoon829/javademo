package ncs;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class test03 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		//System.out.println(cal);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		
		
		cal.set(1987, 5, 27);
		int year2 = cal.get(Calendar.YEAR);
		int month2 = cal.get(Calendar.MONTH);
		int date2 = cal.get(Calendar.DATE);
		int day2 = cal.get(Calendar.DAY_OF_WEEK);
		//System.out.println(day2);
		
		char week = ' ';
		switch(day2) {
		case 7: week = '수'; break;
		}
		
		System.out.printf("생일: %d년 %d월 %d일 %c요일\n", year2, month2, date2, week);
		System.out.printf("현재: %d년 %d월 %d일\n", year, month, date);
		System.out.printf("나이: %d세", year-1987);
		

	}//end main

}//end class
