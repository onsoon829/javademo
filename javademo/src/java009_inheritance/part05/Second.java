package java009_inheritance.part05;

public class Second extends First{
	int b = 20;
	
	public Second() {
		
	}
//	
//	부모클래스의 메소드 접근제어자가 protected이므로 
//	자식클래스의 메소드 접근제어자는 protected 또는 public이 가능하다.
	
	@Override
	protected void display() {
		System.out.println("b=" + b);
	}
	

	
	public void superThisMethod() {
		super.display();
		this.display();
	}
	
	@Override
	public String toString() {
		
		return String.format("a=%d b=%d",a, b);
	}

}//class 
