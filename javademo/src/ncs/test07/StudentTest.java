package ncs.test07;

public class StudentTest {

	public static void main(String[] args) {
		Student[]Student = new Student[3];
		Student[0] = new Student("홍길순", 25, 171, 81, "201401", "영어영문학");
		Student[1] = new Student("한사랑", 23, 183, 72, "201402", "건축학");
		Student[2] = new Student("임꺽정", 26, 175, 65, "201403", "체육학");
		
		for(Student sdt : Student)
			System.out.println(sdt.toString());
		
		

	}

}
