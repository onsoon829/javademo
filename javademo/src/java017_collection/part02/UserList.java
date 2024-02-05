package java017_collection.part02;
/*
 * 선형리스트( Linear List )
 * 1 순서 리스트(Ordered List)
 * 2 자료들 간에 순서를 갖는 리스트
 * 3 선형 리스트에서 원소를 추가한 순서는 원소들의 순서가 된다.
 */
public class UserList {
	private Object[] sale = null;
	private int pointer = 0;
	
	public UserList() {
		this(3);
	}
	
	public UserList(int cnt) {
		sale = new Object[cnt];
	}
	
    public void add(Object element) {
    	if(sale.length == pointer) {//배열이 가득 찼는지 확인.
    		//sale.length: 배열 전체 크기 pointer: 현재 저장된 객체 개수
    	    Object[]arr = new Object[sale.length*2];
    	    //기존 배열 크기의 두배 크기로 새로운 배열 arr 생성
    	    System.arraycopy(sale, 0, arr, 0, sale.length);
    	   //기존 배열 sale의 모든 객체를 새로운 배열 arr로 복사.
    	    sale=arr;
    	    //sale변수가 새로운 배열 arr를 가리키도록 한다.
    	}
    	sale[pointer++] = element;
    	

    }
    //insert
    public void add(int index, Object element) {// 원래 값들을 한칸씩 미뤄서 넣는다.
    	if(sale.length == pointer) {
    	    Object[]arr = new Object[sale.length*2];
    	    System.arraycopy(sale, 0, arr, 0, sale.length);
    	   
    	    sale=arr;
    	}
    	
    	for(int i=pointer; i>index; i--) {
    		sale[i]=sale[i-1];
    	}
    }
    
    public Object get(int index) {
    	if(index < pointer)
    	 return sale[index];
    	else
    		return new ArrayIndexOutOfBoundsException(index);
    }
    
    public Object remove(int index) {//삭제된 요소를 반환하도록 구현
        Object obj = sale[index];
        
        for(int i = index; i<pointer - 1; i++) {
        	sale[i] = sale[i+1];
        }
        pointer--;
        return obj;
    }
    //요소 갯수
    public int size() {
    	return pointer;
    }
    //메모리 크기
    public int capacity() {
    	return sale.length;
    }
}//end class
