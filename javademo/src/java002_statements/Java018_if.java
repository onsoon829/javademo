package java002_statements;
/*
 * if(조건식){
 *   if(조건식){
 *       수행문장;
 *    }else{
 *       수행문장;
 *    }
 * }else{
 *     if(조건식){
 *        수행문장;
 *     }else{
 *         수행문장;
 *     }
 * }
 */

public class Java018_if {

	public static void main(String[] args) {
		boolean member = true;  //회원(true) or 비회원(false)
		String grade = "VIP";   // 회원등급(VIP, 일반)
		
		//회원
		if(member) {
			//VIP
			if(grade=="VIP") {
				System.out.printf("고객님은 %s이며 %d%%적립 했습니다.\n", grade, 30);
			}else{
				System.out.printf("고객님은 %s이며 %d%%적립 했습니다.\n", grade, 10);
			}
		}else {
			//비회원
			System.out.printf("고객님은 %s이며 %d%%적립 했습니다.\n", "비회원", 0);
			
		}
		
      System.out.println("고객님 오늘도 방문을 감사드립니다.");
	}//end main()

}//end class
