package java001_basic;

//자동정렬 : Ctrl + Shift + F  
public class Java004_casting {

	public static void main(String[] args) {
		byte bNum = 2; // -128 ~ 127
		short sNum = 32767; // -32,768 ~ 32,767
		int xNum = 5; // -2,147,483,648 ~ 2,147,483,647
		long lNum = 6L; // L or l -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		float fNum = 2.5F; // F or f
		char cData = 'a';
		
		System.out.println(cData);
		
		cData = 97;   //'a': 97, 'A' :65, '0':48
		System.out.println(cData);
		
		
		//형변환(casting)
		// 1. 묵시적(자동) 형변환 : 작은 데이터 타입을 큰 데이터 타입으로 변환할때 발생
		// 2. 명시적(강제) 형변환 : 큰 데이터 타입을 작은 데이터 타입으로 변환할때 발생
		
	   float tNum =(float)2.6;  //강제 형변환 : double => float
	   System.out.println("tNum:"+ tNum);
	   
	   long gNum = 7; //자동 형변환 : int => long
	   System.out.println("gNum:" + gNum);
	   
	   //데이터 손실이 발생되는 경우
	   byte data= (byte)128;
	   System.out.println("data:"+ data);
	   		
	}// end main()

}// end class
