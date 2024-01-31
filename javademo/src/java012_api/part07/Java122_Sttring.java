package java012_api.part07;

/*
 * 출력결과
ip: 127.0.0.1
part:8080
*/
public class Java122_Sttring {

	public static void main(String[] args) {
		String sn = "127.0.0.1:8080";
		
		int index = sn.indexOf(":");
		System.out.println("ip:" + sn.substring(0, index));
		System.out.println("port:" + sn.substring(index+1));
		
		System.out.println("====================");
		String[]data = sn.split(":");
		System.out.println("IP:" + data[0]);
		System.out.println("port:" + data[1]);
		
//		String sn2 = String.valueOf(sn,0, 9);
//		System.out.printf("ip:%s",sn2);

	}//end main

}//end class
