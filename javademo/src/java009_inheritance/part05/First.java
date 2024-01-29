package java009_inheritance.part05;

//import java.lang.System;
//import java.lang.String;
//import java.lang.Override;
public class First{ // extends Object
	int a =10;
	
	public First() {
		
		
	}
	
	protected void display() {
		System.out.println("a=" + a);
	}
	
	@Override
	public String toString() {// 오버라이딩에 사용됐다
		
		return String.format("a=%d",a);
	}
	
}//end class