package java012_api.part03;

public class Java117_Object_hashcode {
//해쉬태그: 주소?
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		Person p2 = new Person("홍길동");
		//java012_api.part03.Person@7a81197d
		System.out.println(p1);
		//java012_api.part03.Person@5ca881b5
		System.out.println(p2);
		
		//hashCode()메소드는 16진수 값(7a81197d)을
		//10진수(2055281021)로 리턴해주는 값이다.
		System.out.println(p1.hashCode());
		//hashCode()메소드는 16진수 값(5ca881b5)을
		//10진수(1554547125)로 리턴해주는 값이다.
		System.out.println(p2.hashCode());
		
		System.out.println("//Member/////////////");
		Member m1 = new Member("홍길동",20);
		Member m2 = new Member("홍길동",20);
	    System.out.println(m1);//java012_api.part03.Member@4517d9a3
	    System.out.println(m2);//java012_api.part03.Member@372f7a8d
	    System.out.println(m1.hashCode());//1159190947
	    System.out.println(m2.hashCode());//925858445
		
	    //원래 해시코드값을 리턴한다.
	    System.out.println(System.identityHashCode(m1));
	    System.out.println(System.identityHashCode(m2));
	    
	    System.out.println("======String============");
	    String s1 = "java";
	    String s2 = "java";
	    System.out.println(s1.hashCode());
	    System.out.println(s2.hashCode());
	    
	    String s3 = new String("java");
	    String s4 = new String("java");
	    System.out.println(s3.hashCode());
	    System.out.println(s4.hashCode());
	    System.out.println("==identityHashCode==");
	    //798154996
	    System.out.println(System.identityHashCode(s1));
	    //798154996
	    System.out.println(System.identityHashCode(s2));
	    //681842940
	    System.out.println(System.identityHashCode(s3));
	    //1392838282
	    System.out.println(System.identityHashCode(s4));
	    
	    System.out.println(s1==s2); //true
	    System.out.println(s1.equals(s2));//true
	    System.out.println(s3==s4);//false
	    System.out.println(s3.equals(s4));///true
	    System.out.println(s1==s3);//false 주소가 다르다
	    System.out.println(s1.equals(s3));//true

	}

}//end class
