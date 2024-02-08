package ncs.test08;

public class User extends UserTest {
	String id;
	String password;
	String name;
	int age;
	char gender;
	String phone;
	
	public User() {
		
	}
	
	public User(String id, String password, String name, int age, char gender, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}//생성자 생성
	
	public String getid() {
		return id;
	}
	
	public void setid(String id) {
		this.id = id;
	}
	
	public String getpassword() {
		return password;
	}
	
	public void setpassword(String password) {
		this.password = password;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public int getage() {
		return age;
	}
	
	public void setage(int age) {
		this.age = age;
	}
	
	public char getgender() {
		return gender;
	}
	
	public void setgender(char gender) {
		this.gender = gender;
	}
	
	public String getphone() {
		return phone;
	}
	
	public void setphone(String phone) {
		this.id = id;
	}
	
	@Override
    public String toString() {
    	 return String.format("%s %s %c %d %s %s", getid(), getpassword(), getname(), getage(), getgender(), getphone());
    	 //
    }
	

}


