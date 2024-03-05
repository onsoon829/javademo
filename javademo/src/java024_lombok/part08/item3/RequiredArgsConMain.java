package java024_lombok.part08.item3;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

public class RequiredArgsConMain {

	public static void main(String[] args) {
		//nonnull이나 final이 선언된 변수만 가지고 생성한다.
		//@RequiredArgsConstructor
		Product pt = new Product("김민재", 3000);//Product(String pname, int price)
        System.out.println(pt.toString());
        
        //@AllArgsConstructor
        Product pn = new Product(null, 0 , false);//Product(String pname, int price, boolean chk)
        System.out.println(pn.toString());
	}

}
