package ncs.test05;

public class BookArrayTest {

	public static void main(String[] args) {
         Book[]bArray = new Book[3];
         bArray[0] = new Book("자바의 정석", "남궁성", 30000,  "도우출판", 10);
         bArray[1] = new Book("열혈강의 자바", "구정은", 29000, "프리렉", 10);
         bArray[2] = new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 10);
         display(bArray);
        
         
	}//end main
	
	public static void display(Book[]bArray) {
		for(int i = 0; i < bArray.length; i++) {
			System.out.println(bArray[i].toString());
		}
		
		
	}
       
}//end class
