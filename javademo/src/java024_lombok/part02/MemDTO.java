package java024_lombok.part02;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class MemDTO {
	private int num;
	private String name;
	private int age;
	private String loc;
	
	
}
