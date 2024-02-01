package java012_api.part08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java130_RegEx {

	public static void main(String[] args) {
		String phone = "016-253-5243";
		
		System.out.println(phone.matches("01(1|6|9)-[0-9]{3,4}-[0-9]{4}"));//
        System.out.println(phone.matches("01(1|6|9)-[\\d]{3,4}-[\\d]{4}"));
        
        Pattern pt = Pattern.compile("01(1|6|9)-[0-9]{3,4}-[0-9]{4}");
        Matcher mt = pt.matcher(phone);
        while(mt.find()) {
        	System.out.println(mt.group());
        }
        
        System.out.println(mt.matches());//정규화 패턴이 맞는지 확인할 때 쓴다. 
	}//end main

}//end class
