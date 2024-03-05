package java024_lombok.part06;

import java024_lombok.part01.MemDTO;
import java024_lombok.part06.item1.PersonDTO;
import java024_lombok.part06.item2.HumanDTO;

public class GetterSetterMain {

	public static void main(String[] args) {
		PersonDTO pt = new PersonDTO();
//		pt.setName("여진구");
//		System.out.println(pt.getName());
		
		//pt.setAge(30);
		pt.setAge(30);
		//System.out.println(pt.getAge());
		System.out.println(PersonDTO.getAge());
		
		//protected 접근제어자로 호출할 수 없다
		//pt.setLoc("서울");
		
		pt.display();
		
		HumanDTO ht = new HumanDTO();
		ht.setName("김민재");
		System.out.println(ht.getName());
		//setAge()메소드가 생성되어 있지 않으므로 오류 발생
		//ht.setAge(40)
		
		MemDTO mt = new MemDTO();
		mt.setName("홍길동");
		mt.setAge(30);
		mt.setLoc("서울");
		System.out.println(mt);
		System.out.printf("name:%s\n", mt.getName());
		System.out.printf("age:%s\n", mt.getAge());
		
		//Getter에서는 생성되어 있지 않으므로 오류발생
		System.out.printf("loc:%s\n", mt.getLoc());

	}

}
