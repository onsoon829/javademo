package java024_lombok.part09;

public class ValueMain {

	public static void main(String[] args) {
		ValueDTO ex = new ValueDTO();
		ex.setName("여진구");
		ex.setSalary(3000);
		System.out.printf("%s %d", ex.getName(), ex.getSalary());

	}

}
