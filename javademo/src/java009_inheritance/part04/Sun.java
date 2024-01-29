package java009_inheritance.part04;

public class Sun extends Parent{
	String dept;
	public Sun() {
		
	}
	
	public Sun(String name, int age, String dept) {//3
		super(name, age); //4
		this.dept = dept;//10
		
	}//11
	
	public String toString() {
		return String.format("%s %d %s", name, age, dept);
	}

}
