package java006_class.part01;

// 아래 타입들을 정의 할 수 없다. (ex. void)
// int, float, double
// int[]
// class

// 클래스 정의
public class Person {
	
	// 멤버변수
    String name;
    int age;
    char gender;
    
    // 생성자
    Person () {
    	
    }     
    
    // 메소드
    void develop () {
      System.out.println("개발한다");
    }
    
    void run () {
     System.out.println("달린다");
    }
    
}
