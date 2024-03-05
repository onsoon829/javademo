package java024_lombok.part10;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.ToString;

//of: 포함할 변수를 설정한다.
//exclude: 제외할 변수를 설정한다.
//@ToString(of= {"code", "name", "chk"})
@ToString(exclude= {"name"})
//@ToString
@Builder // 써놓으면@AllArgsConstructor처럼 만들어진다?
//
//DTO로 만들어진 객체는 static, final을 붙이지 않는다?
public class User {
	private static String code;
	@NonNull
	private String name;
	private final int salary;
	private boolean chk;
}//end class 
