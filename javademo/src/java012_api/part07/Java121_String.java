package java012_api.part07;

public class Java121_String {

	public static void main(String[] args) {
		String str = new String("KoREa,jsp,java");//내부에서 생성될 때는 배열 형태로 저장된다.
		
		System.out.println("문자열 길이:" + str.length());// 14
        System.out.println("대문자:"+str.toUpperCase());//KOREA,JSP,JAVA
        System.out.println(str);
        System.out.println("소문자:"+str.toLowerCase());//korea,jsp,java
        System.out.println(str);
        System.out.println("문자:" + str.charAt(0));// 메모리 생성하면 값 안바뀐다.
        System.out.println("인덱스:" + str.indexOf('a'));//최초로 'a'가 나오는 위치 출력-> 4
        System.out.println("인덱스:" + str.indexOf(97));// 위와 같다.(유니코드값방식으로 물어본 거임)졸리
        System.out.println("인덱스:" + str.indexOf('a',5));//5 인덱스부터 'a'를 찾아라->11
        System.out.println("인덱스:" + str.indexOf(97,5));//위와 같다.(유니코드값방식으로 물어본 거임)졸리
        System.out.println("인덱스:" + str.lastIndexOf('a'));//끝까지 세서 마지막'a'를 찾아라-> 13
        
        System.out.println("범위:" + str.substring(5));//5부터의 값을 몽땅 가져와라.->,jsp,java
        
        System.out.println("범위:" + str.substring(2, 8));//2인덱스부터 8인덱스 미만의 문자열 가져와라->REa,js
        
      //str.spl - ctrl + space bar
        String[]arr = str.split(",");
        for(int i = 0; i < arr.length; i++) {
        	System.out.printf("arr[%d] = %s\n", i ,arr[i]);// 각 배열별 값 가져와라.하하하하하하
        }
        
        int x = 10;
        int y = 20;
//        System.out.printf("x=%d, y=%d\n", x, y);
//        
//        String s1 = String.valueOf(x);//모든 자료형의 값 string으로 리턴할 수 있다.
//        String s2 = String.valueOf(y);
//        System.out.println(s1+s2);//-> 1020
//        
//        char[]data = {'1','2','3','4','5'};
//        String s3 = String.valueOf(data);//data 값 가져와라.
//        System.out.println(s3);
//        
//        String s4 = String.valueOf(data, 1, 3);// data의 1인데스부터 3까지 가져와라.
//        System.out.println(s4);
        
	}//end main

}//end class
