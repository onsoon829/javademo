package java009_inheritance.part07;

public class SuperClass {
	int x, y, z;

	public SuperClass() { //11
         System.out.println("*** x,y,z에 값채우기***"); 
	} 
	
	public SuperClass(int k) { //9
		this(); //10
		this.x = k;  //14
		System.out.println(k +"을 넘겨받은 생성자"); 
	} 
	
	public SuperClass(int a, int b) { //7
		this(a); //8
		this.y=b; //17
		System.out.println(a+ "  " + b +"  을 넘겨받은 생성자"); //18
	} //16
	
	public SuperClass(int a, int b, int c) { //5
		this(a, b); 
		z = c; //20
		System.out.println(a + "   " + b + "   " + c + "을 넘겨받은 생성자");//21
	} 
	
	public void display() { //24
		System.out.printf("%d %d %d\n", x, y, z);  //25 
	} 
}//end class








