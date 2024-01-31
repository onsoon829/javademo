package java009_inheritance.part09;

/* 
[출력결과]
삼성          SHV-E250S     200000
삼성          SHV-E160S     180000
아이폰        A1586 	      250000
아이폰        A1524 	      220000
LG         LG-F700L 	  190000
LG         LG-F650L 	  180000
***************************************************
삼성         SHV-E250S     200000   010-2534-2532    SK
아이폰        A1586         250000   010-2532-5902    LG
LG          LG-F650L      180000   010-7280-5283     KT
아이폰        A1524         220000   010-2259-3052     LG
*/

public class java101_inheritance {

	public static void main(String[] args) {

		HandPhone[] HandPhone = new HandPhone[6];
		HandPhone[0] = new HandPhone("삼성", "SHV-E250S", 200000);
		HandPhone[1] = new HandPhone("삼성", "SHV-E160S", 180000);
		HandPhone[2] = new HandPhone("아이폰", "A1586", 250000);
		HandPhone[3] = new HandPhone("아이폰", "A1524", 220000);
		HandPhone[4] = new HandPhone("LG", "LG-F700L", 190000);
		HandPhone[5] = new HandPhone("LG", "LG-F650L", 180000);

		/*
		 * for(int i = 0; i<HandPhone.length; i++)
		 * System.out.println(HandPhone[i].toString());
		 */

		for (HandPhone hPhone : HandPhone)
			System.out.println(hPhone.toString());

		System.out.println("***************************************");

		SmartPhone[] smartPhone = new SmartPhone[4];
		smartPhone[0] = new SmartPhone("삼성", "SHV-E250S", 200000, "010-2534-2532", "SK");
		smartPhone[1] = new SmartPhone("아이폰", "A1586", 250000, "010-2532-5902", "LG");
		smartPhone[2] = new SmartPhone("LG", "LG-F650L", 180000, "010-7280-5283", "KT");
		smartPhone[3] = new SmartPhone("아이폰", "A1524", 220000, "010-2259-3052", "LG");

		for (int i = 0; i < smartPhone.length; i++)
			System.err.println(smartPhone[i].toString());

		for (SmartPhone sPhone : smartPhone)
			System.out.println(sPhone.toString());

	}// end main

}// end class
