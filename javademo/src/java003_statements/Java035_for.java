package java003_statements;

public class Java035_for {

	public static void main(String[] args) {
		go: //label선언
		for(int i = 1;i <= 3; i++) {
			System.out.printf("i=%d\n", i);
			for(int j = 1;j <= 5;j++) {
				System.out.printf("j=%d\n", j);
				if (j == 3)
					//break
				    //break go;// break에 밖에 선언한 label을 써주면 안의 for문만 빠져나가는게 아니라 완전히 빠져나간다.
				    continue go;
			}
		}
	}//end main

}//end class
