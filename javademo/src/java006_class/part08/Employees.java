package java006_class.part08;

/*
 * this : 메모리에 생성된 객체 자신을 의미한다.
 * 1. this.멤버변수 
 * 2. this.메소드()
 * 3. this( ) :생성자
 */

public class Employees{
	String name;
	String dept;
	int salary;
	
	public Employees() {
		
	}
	
	public Employees(String name) {
		this("보류", 3000);
		this.name = name;
	}
	
	public Employees(String dept, int salary) {
		this.dept = dept;
		this.salary = salary;
		
	}
	
	public Employees(String name, String dept, int salary) {
		//this.맴버변수 = 매개변수
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public String toString() {
		return String.format("%s %s %d", this.name, dept, salary); 
			
	   
	
    }



	
}//end class