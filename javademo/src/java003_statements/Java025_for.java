package java003_statements;
/*
 * for(초기식; 조건식; 증감식){
 *   반복 수행할 문장;
 * }
 * 
 * 1. 조건식이 true일때만 반복을 실행한다.
 * 2. for문 실행순서
 *    초기식 -> 조건식(true) -> 반복수행 -> 증감식
 *         -> 조건식(true) -> 반복수행 -> 증감식
 *         -> 조건식(true) -> 반복수행 -> 증감식
 *         .......
 *         -> 조건식(false) -> for문을 종료함
 *         
 *3. 초기식은 한번만 수행한다.
 *4. 초기식, 조건식, 증감식은 생략할 수 있지만 for(;;)세미콜론은 생략할 수 없다.
 *5. 초기식, 증감식은 여러개 사용할 수 있으나 조건식은 한개이하만 사용할 수 있다.
 *   for(int a=3, b=4; ; sum+=a, hap+=b){  }//타입이 같으면 주루룩 쓸 수 있다.
 *6. 조건식을 생략하면(생략가능) true로 처리한다.(무한루프)
 *    for문의 종료 시점을 정확히 파악할 수 없을 때 for문의 조건식을 생략한다.  
 * 
 */
public class Java025_for {

	public static void main(String[] args) {
		/*
		 * System.out.println(1); System.out.println(2); System.out.println(3);
		 * System.out.println(4); System.out.println(5);
		 *///... 이럼 너무 많다.
		//int a = 1;
		for (int a=1; a <= 5; a++) { //진행순서 1. int a=1 2. a <=5 3. print 4. a++ 다시 2번~
			System.out.println(a);   //조건식이 false 날 때까지 반복
		}//변수선언 안에서 하느냐 밖에서 하느냐에 따라 변수 읽을 수 있는지 없는지 알게 된다
		//ex)for문에서 선언한 변수값-> 밖에선 값 못 부른다. 애초에 밖에서 변수 선언한 값만 불러옴.
        //밖에서 변수 선언해놓고 for문의 변수로 활용은 가능
	}//end main

}//end class
