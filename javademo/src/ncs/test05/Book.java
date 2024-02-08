package ncs.test05;

public class Book {
	String title;
	String author;
	int price;
	String publisher;
	double discountRate;
	double discount = price/10;
	
	Book(String title, String author, int price, String publisher, double discountRate){
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discountRate = discountRate;
		this.discount = discount;
		
	}
//getter, setter 사용	
	public String toString() {
		return title + "  " +author + "  " + price + "  " + publisher + "  " + discountRate + "% 할인\n" + "할인된 가격:" + price/10*9 + "원";
	}
}
