package java009_inheritance.part04;

public class Parent{
	String name;
	int age;
	
	public Parent() {
		
	}
	
	public Parent(String name, int age) { //5
		super(); //6
		this.name = name; //7
		this.age = age; //8
	}//9
}//end class