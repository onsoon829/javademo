package java018_collection.part10;

public class Box<T> {
	//class T와 관련된 것들은 모두 string으로 받는다?
	private T data;
	
	public Box() {
		
	}
	
	public Box(T data) {
		this.data = data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}

}

//Box<String> b = new Box<String>("jsp");
//Box<Integer> b = new Box<Integer>(10);
