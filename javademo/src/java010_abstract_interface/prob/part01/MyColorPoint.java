package java010_abstract_interface.prob.part01;

public class MyColorPoint extends MyPoint{
	public String color;
	int z;
	public MyColorPoint() {
	
	}

	
	public MyColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	
	@Override
	protected void move(int x, int y) {
	}

	@Override
	protected void reverse() {
	z = x;
	x = y;
	y = z;		
	}
	
	@Override
	protected void show() {
		System.out.println(x + "," + y + "," + color);
	}
	
	
	
	
}
