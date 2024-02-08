package ncs.test07;

public class Student extends Human{
    String number;
    String major;
    
    public Student() {
    	
    }
    
    public Student(String name, int age, int height, int weight, String number, String major) {
    	super(name, age, height, weight);
    	this.number = number;
    	this.major = major;
    }
    
    public String getNumber() {
    	return number;
    }
    
    public void setNumber(String number) {
    	this.number = number;
    }
    
    public String getMajor() {
    	return major;
    }
    
    public void setMajor(String major) {
    	this.major = major;
    }
    
    @Override
    public String toString() {
    	 
    	
    	return String.format("%s %d %d %d %s %s", getname(), getage(), getheight(), getweight(), getNumber(), getMajor());
    	 //return String.format("%s %10s %10s", super.toString(), number, major);
    }
    
}//end class


