package java012_api.part04;

//Protected Object clone() throws CloneNotSupportedException

//Cloneable인터페이스를 상속받아야만 clone()메소드를 호출할 수 있다.
public class House implements Cloneable{
	String name;
	int age;
	Address address;
	//House house;
	
	public House(String name, int age, Address adress) {
		this.name = name;
		this.age = age;
		this.address = address;
		
		
	}
	
	public House shallowCopy() {
		
		House house = null;
		try {
			house = (House)super.clone();// 외우자..?
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return house;
	}
	
	public House deepCopy() {
		House house = null;
		try {
			Address cloneAddress = address.clone();
			
			house = (House)super.clone();
			house.address = cloneAddress;
			
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		return house;
		
	}
}// end class