package java003_statements;

public class Java037_while {

	public static void main(String[] args) {
		int cnt = 1;
		
		while(true) {// while안의 조건식 항상 참으로 출력하고 싶으면(원래는 조건식 생략 불가능)그냥 true 넣어라.
			System.out.println(cnt+1);
			if(cnt==6)
				break;
		}

	}//end main

}//end class
