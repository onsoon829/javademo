package java012_api.part04;

public class Address implements Cloneable{
	String city;
	
	public Address(String city) {
		this.city = city;
	}
//House에서 깊은 복사가 되도록 clone() 실행시켜야 한다.
@Override
public Address clone()  {
	Address obj = null;
	try {
		obj = (Address)super.clone();
	} catch (CloneNotSupportedException e) {
		
		e.printStackTrace();
	}
	
	return obj;
}
	
}
