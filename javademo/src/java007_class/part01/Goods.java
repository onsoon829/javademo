package java007_class.part01;
//타입이 같으면 배열로도 관리 가능
public class Goods{
	String name; // 상품명
	int price; // 가격
	int numberOfStock; // 상품 재고
	int sold; // 팔린 수량
	
	public Goods() {
		
	}
//오른쪽 마우스 - source - generate constructor~field - 확인
	public Goods(String name, int price, int numberOfStock, int sold) {
		super();
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}
     public String toString() {
    	 return String.format("%-14s %8d %5d %5d", name, price, numberOfStock, sold);
     }	
}//end class



