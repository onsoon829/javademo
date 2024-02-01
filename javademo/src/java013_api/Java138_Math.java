package java013_api;

public class Java138_Math {

	public static void main(String[] args) {
		int[]num = new int[5];//1부터 10까지
		
		System.out.println(Math.random());//범위의 숫자를 무작위로 가져와라.
		
		double de = Math.random();
		System.out.println(de); //0.0부터 ~1.0미만
		
		de = de * 10;
		System.out.println(de); //0.0부터 9.9999
		
		System.out.println(Math.floor(de));//0.0 ~9.0
		
		System.out.println((int)Math.floor(de)); //0~9
		System.out.println((int)Math.floor(de)+1); // 1~10
		
		System.out.println((int)Math.floor(Math.random() * 10) + 1);

	}//end main

}//end class
