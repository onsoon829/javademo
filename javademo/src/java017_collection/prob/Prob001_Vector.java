package java017_collection.prob;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

import java017_collection.part05.Sawon;

/*ㅇDB연동때 매우 중요
 * [문제] : booklist.txt 파일의 데이터를 이용하여 
 *      책 정보 하나당 하나의 Book 객체를 생성하고 생성된 Book 객체들을 
 *      Vector에 담아서 리턴하는 makeBookList() 메서드를 구현하시오.
 *      
 * [실행결과]
 * Java Programming 의 가격 : 25000
 * SQL Fundamentals 의 가격 : 47000
 * JDBC Programming 의 가격 : 30000
 * Servlet Programming 의 가격 : 20000
 * JSP Programming 의 가격 : 21000
 */
public class Prob001_Vector {

	public static void main(String[] args) throws Exception {
		Vector<Book> bookList = makeBookList();
		for (Book book : bookList) {
			System.out.println(book.getTitle() + " 의 가격 : " + book.getPrice());
		}
		String path = "./src/java017_collection/prob/bookList.txt";
		Vector<Book> vt = lines(path);
		prnDisplay(vt);
	}// end main()

	private static Vector<Book> makeBookList(String fileName)  {
		// booklist.txt 파일의 데이터를 Vector에 저장한 후 리턴하는 프로그램을 구현하시오.
	    Vector<Book>vt = new Vector<Book>();
	    Scanner sc = null;
	    
	    try {
	    	sc = new Scanner(new File(fileName));
	    	while(sc.hasNextLine()) {
	    		String[]data = sc.nextLine().split("[/]");
	    		Book sn = new Book(data[0], String.parseInt(data[1]), 
	    				String.parseInt(data[2]), String.parseInt(data[3]));
	    		vt.add(null);
	    	}
	    }catch(FileNotFoundException e) {
	    	e.printStackTrace();
	    
	    }
	    
	     
		return null;
	}// end makeBookList()

}// end class















