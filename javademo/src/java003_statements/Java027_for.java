package java003_statements;

/*i = 1 sum = 1 
i = 2 sum = 3
i = 3 sum = 6
i = 4 sum = 10
i = 5 sum = 15*/
public class Java027_for {

	public static void main(String[] args) {
		int sum = 0;
	    int i;
	    
	    for (i=1;; i++) { //조건식 생략된 상태
	    	sum = sum + i; //냅두면 무한히 진행된다.
	    	
	    	System.out.printf("i=%d, sum=%d\n", i ,sum);
	        if (sum >= 15) {//빠져나오기 위해 if문 활용//조건식 만족했을 때 sum=뭐시기, if문 둘다 실행.
	        	break;
	        }
	        
	    }
        //System.out.printf("i=%d, sum=%d\n", i ,sum);

	}//end main

}//end class
