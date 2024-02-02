package java014_api;
import java.text.SimpleDateFormat;
import java.util.Calendar;
//2024년 3월의 마지막일과 요일을 구하는 프로그램을 구현하세요.
//출력결과
//2024-3-29 일요일
public class Java156_Calendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		cal.set(2024, 2, 1);//날짜 세팅 2024, 3, 1
		//cal.set(calendar.MONTH, 2);
		int year = cal.get(Calendar.YEAR);//24시간
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		System.out.printf("%d-%d-%d\n", year, month, date);
		
		//2024년 3월의 마지막을 리턴
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastDate);
		
		cal.set(Calendar.DATE, lastDate);
		year = cal.get(Calendar.YEAR);//24시간
		month = cal.get(Calendar.MONTH) + 1;
		date = cal.get(Calendar.DATE);
		System.out.printf("%d-%d-%d\n", year, month, date);
		
		//2024년 3월 13일의 요일을 리턴
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		
		char week = ' ';
		switch(day) {
		case 1:  week ='일'; break;
		case 2:  week ='월'; break;
		case 3:  week ='화'; break;
		case 4:  week ='수'; break;
		case 5:  week ='목'; break;
		case 6:  week ='금'; break;
		case 7:  week ='토'; break;
		}
		
	    System.out.printf("%d-%d-%d %c요일\n", year, month, date, week);
	    
	    
	}//end main

}//end class
