package ncs.test04;

public class Product {
	String name;//상품명
	int price;//가격
	int cnt;// 수량
	
    int count() {
    	return price*cnt;
    }
    
    void display() {
    	System.out.printf("상품명: %s\n",  name);
    	System.out.printf("가격: %d원\n", price);
    	System.out.printf("수량: %d개\n", cnt);
    	System.out.printf("금액: %d원", count());
    }

}//end class
