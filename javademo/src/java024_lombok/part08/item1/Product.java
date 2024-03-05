package java024_lombok.part08.item1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@NoArgsConstructor//final 선언된 변수 있으면 오류 뜬다.
@AllArgsConstructor
//source-using field클릭-자동완성
@ToString
@Getter
@Setter
public class Product {
	private static String code;
	//class차원일대 static선언돼있으면 getter setter 생성 안된다.
	private String pname;
	private final int price;
	private boolean chk;
	
	
	
	

}
