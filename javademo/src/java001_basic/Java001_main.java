package java001_basic;

//이클립스 재단에서 관리-어답티움 : https://adoptium.net

public class Java001_main {     
	
   public static void main(String[] args) {  //프로그램 시작
	   System.out.println("Hello Java!!!");	   
   }//프로그램 끝
}


//컴파일 : javac -d [바이트코드파일저장위치] [소스경로/*.java]
//javac -d . Java001_main.java -encoding UTF8

//실행 : java [패키지.클래스명]
//java  java001_basic.Java001_main
//실행 : java -cp [바이트코드파일위치][패키지.클래스명]
//java -cp . java001_basic.Java001_main