package java021_jdbc.part03;
// 내용 삽입하는 방법
import java.util.List;
import java.util.Scanner;

public class Java218_Jdbc {

	public static void main(String[] args) {
		MemController memController = new MemController();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("========================================");
			System.out.println("1 List, 2 Insert, 3 Update, 4 Delete, 5 Exit ");
			int input = Integer.parseInt(sc.nextLine());
			if(input == 1) {//리스트
				listCall(memController);
			}else if(input==2) {// 삽입
				insertCall(memController, sc);
				//listCall(memController); 확인용
			}else if(input==3) {
				
			}else if(input==4) {
				
			}else if(input==5) {
				System.out.println("시스템 종료");
				sc.close();
				System.exit(0);
			}
		}

	}//end main
	
	public static void insertCall(MemController MemController, Scanner sc) {
		System.out.printf("이름: ");
		String name = sc.nextLine();
		
		System.out.printf("나이: ");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.printf("지역: ");
		String loc = sc.nextLine();
		
		int chk = MemController.insertProcess(new MemDTO(name, age, loc));
		System.out.printf("%d개 삽입\n", chk);
	}
	
	public static void listCall(MemController memController) {
		List<MemDTO> aList = memController.listProcess();
		if(aList.size()==0) {
			System.out.println("데이터가 없습니다.");
			return;
		}
		
		for(MemDTO dto: aList)
			System.out.printf("%d %s %d %s\n", dto.getNum(), dto.getName(), dto.getAge(), dto.getLoc());
	}//end listCall()

}//end class
