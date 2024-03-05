package java024_lombok.part08.item3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@ToString
@RequiredArgsConstructor//final 혹은 @NonNull인 변수만 parameter로 받는 생성자를 생성해준다.
@AllArgsConstructor//requiredArgsconstructor와 같이 쓴다.
public class Product {
	private static String code;
	@NonNull//->nonnull이나 final이 선언된 변수만 가지고 생성한다.
	private String pname;
	private final int price;
	private boolean chk;
	
	
	
	

}
