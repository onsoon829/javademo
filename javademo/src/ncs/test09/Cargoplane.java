package ncs.test09;

public class Cargoplane extends PlaneTest{
	String planeName;
	int fuelSize;
	int Distance;
	public Cargoplane() {
		
	}
	
	public Cargoplane(String planeName, int fuelSize) {
		super();
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	public String getplaneName() {
		return planeName;
	}
	
	public void setplaneName(String planeName) {
		this.planeName = planeName;
	}
	
	public int getfuelSize() {
		return fuelSize;
	}
	
	public void setfuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	
	public int getDistance() {
		return Distance;
	}
	
	public void setDistance(int Distance) {
		this.Distance = Distance;
	}
	
	@Override
	public String toString() {
		
		return String.format("%s %4d", planeName, fuelSize);
	}

}
