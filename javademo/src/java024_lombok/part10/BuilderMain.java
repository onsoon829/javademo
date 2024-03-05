package java024_lombok.part10;
//https://devk0ng.github.io/2021/07/30/lombok/#AllArgsConstructor
public class BuilderMain {

	public static void main(String[] args) {
		Book bk = new Book("j001", "java의 정석");
		System.out.println(bk);
		
		//같은 타입의 변수면 순서 바껴도 오류 나지 않는다?
		Book bn = new Book("mysql", "m001");
		System.out.println(bn);
		
		User us = User.builder().name("김민재").salary(3000).chk(false).build();
		System.out.println(us);
		
		User us2 = User.builder().name("여진구").salary(4000).build();
		System.out.println(us2);
		
		User us3 = User.builder().name("고길동").build();
		System.out.println(us3);
		
		//User us4 = User.builder().code("a001").name("이기상").build();
		//static 선언된 맴버변수(정적변수)는 생성자로 초기화가 안된다.
	}//end main

}//end class
