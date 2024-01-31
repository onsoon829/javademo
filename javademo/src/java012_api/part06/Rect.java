package java012_api.part06;

public class Rect implements Cloneable{//clone 만들 준비 implements Cloneable 추가
	int width;
	int height;
	
	public Rect() {
		
	}
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width * height;
	}
	
	public Rect clone() {
		Rect obj = null;
		
		try {
			obj = (Rect)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
		}
		
		return obj;
	}
}
