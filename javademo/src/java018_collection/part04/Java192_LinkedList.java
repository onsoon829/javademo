package java018_collection.part04;

import java.util.LinkedList;

/*
 * Queue(큐)
 * 1. FIFO (First In First Out) : 제일 먼저 저장한 요소를 먼저 꺼내온다.
 * 2. 최근 사용문서, 인쇄작업대기목록, 버퍼
 */
public class Java192_LinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> nQueue = new LinkedList<String>();
        nQueue.offer(new String("java"));
        nQueue.offer(new String("jsp"));
        nQueue.offer(new String("spring"));
        System.out.println(nQueue.size());
        
        System.out.println(nQueue.poll());//첫번째값부터 뽑아오기
        System.out.println(nQueue.poll());//두번째값 뽑아오기
        System.out.println(nQueue.poll());//세번째값 뽑아오기
        System.out.println(nQueue.size());//다 뽑히고 값들 없음. 0
        
        //null
        System.out.println(nQueue.poll());//뽑아올 값 없음. null
        
        while(!nQueue.isEmpty()) {
        	System.out.println(nQueue.poll());
        }
        
        System.out.println(nQueue.size());
	}//end main

}//end class
