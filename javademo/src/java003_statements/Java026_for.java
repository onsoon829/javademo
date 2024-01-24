package java003_statements;

public class Java026_for {

	public static void main(String[] args) {
		// 누적된 값이 최초로 15이상일때 까지만 반복문을 수행
	    int sum = 0;
	    int i;
	    
	    for (i=1;; i++) { //조건식 생략된 상태
	    	sum = sum + i; //냅두면 무한히 진행된다.
	        if (sum >= 15) {//빠져나오기 위해 if문 활용//조건식 만족했을 때 sum=뭐시기, if문 둘다 실행.
	        	break;
	        }
	        
	    }
        System.out.printf("i=%d, sum=%d\n", i ,sum);
	}//end main

}//end class
