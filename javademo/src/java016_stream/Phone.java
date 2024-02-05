package java016_stream;
/*
 * 직렬화(serializable)
 * 1. 객체를 연속적인 데이터로 변화하는 것이다.
 *    반대로 역직렬화이다.
 * 2. 객체의 멤버변수들의 값을 일렬로 나열하는 것이다.
 * 3. 객체를 저장하기 위해서는 객체를 직렬화 해야 한다.
 * 4. 객체를 저장한다는 것은 객체의 멤버변수의 값을 저장한다는 것이다.
 * 5. 객체를 직렬화하여 입출력할 수 있는 스트림
 *    ObjectInputStream, ObjectOutputStream
 * 6. 직렬화에서 제외할 멤버변수에서는  transient를 선언한다.
 * 
 */
import java.io.Serializable;
public class Phone implements Serializable{
	
	private
	String name;
	// 직렬화에서 제외할 멤버변수에 transient 키워드를 명시한다.
	transient int price;
	
}
public class Phone {
	String name;
	int price;
	
	public Phone() {
		
	}
	
	public Phone(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d", name, price);
	}

}
