package java012_api.part03;

public class Member {
	String name;
	int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//name 변수값이 같은 Member객체는
	//항상 같은 해시코드를 반환한다.
//	@Override
//	public int hashCode() {
//		return Objects.hash(age,name);
//	}

}//end class
