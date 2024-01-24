package java000_debug;

public class Test004 {

	public static void main(String[] args) {
		int sum = 0;
	    int i;
	    
	    for (i=1;; i++) { //조건식 생략된 상태
	    	sum = sum + i; //냅두면 무한히 진행된다.
	    	
	    	System.out.printf("i=%d\n" + "", i);
	        if (sum >= 15) {
	        	break;
	        }
	    }
	    
	    System.out.printf("sum=%d\n",sum);

	}

}
