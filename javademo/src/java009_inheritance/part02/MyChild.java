package java009_inheritance.part02;
//자식클래스의 생성자에서는 반드시 부모클래스의 생성자를 호출한다.
public class MyChild extends MyFather{
	
	public MyChild() {//2
		
		super();//3
		System.out.println("MyChild");//12
	}//13

}
