package java013_api;
/*
 * 단입력: 5
 * 5 X 1 = 5
 * 5 X 2 = 10
 * . . . 
 * 5 X 9 = 45
 * 계속하시겠습니까?(종료:n, 계속:아무키) n
 * 프로그램종료
 * 
 */
import java.util.Scanner;
public class Java148_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("단입력: ");// 

			 int dan = sc.nextInt();
			 for(int i = 0; i<10; i++) {
				System.out.printf("%d X %d = %2d\n", dan, i ,dan*i);
			 }
			 System.out.print("계속하시겠습니까?(종료: n, 계속: 아무키)");
			 String chk = sc.next();
			 if(chk.equals("n")) {
				 System.out.println("프로그램종료");
				 break;
			 }
		} 
		
		sc.close();
//		String line = sc.nextLine();
//		System.out.println(line);
//		int a = sc.next();
//		System.out.println(a);
		
		
		//System.out.printf("%s X %s = %s", a, b, c);
		

	}//end main

}//end class
