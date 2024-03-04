package java024_lombok.part02;

public class Test {

	public static void main(String[] args) {
		MemDTO dto = new MemDTO();
		dto.setNum(1);
		dto.setName("홍길동");
		dto.setAge(30);
		dto.setLoc("경기");
		
		System.out.printf("%d %s %d %s\n", dto.getNum(), dto.getName(), dto.getAge(), dto.getLoc());

	}

}
