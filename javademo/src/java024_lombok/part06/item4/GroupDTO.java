package java024_lombok.part06.item4;

import lombok.Getter;
import lombok.Setter;

/*
 * boolean타입은 isXXX()메소드 생성이 되고
 * Boolean타입은 getXXX()메소드 생성이 된다.
 * 
 * @Setter
 * boolean과 Boolean 타입 모두 setXXX()메소드를 생성한다.
 */
@Getter
@Setter
public class GroupDTO {
	private String name;
	private boolean gen;//기본 데이터 타입 //setGen(boolean gen), isGen()
	private Boolean chk;//클래스값? //setChk(Boolean chk), getChk()

}
