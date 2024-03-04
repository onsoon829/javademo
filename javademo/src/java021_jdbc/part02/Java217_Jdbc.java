 package java021_jdbc.part02;

import java.util.List;
import java.util.Scanner;
/*
 * MCV패턴
 * Model: 데이터 관리(DTO, DAO)
 * DTO(Data Transfer Object): 소프트웨어 개발에서 데이터를
 *                           java에서는 DTO를 클래스로 정의하여 데이터를 캡슐화하고 전달하는 용도.                 
 * 
 * DAO(Data Access Object): 데이터베이스나 다른 데이터 저장소와의 상호작용을 담당하는 객체.
 *                          java에서는 dao를 사용하여 데이터베이스에 접근하고 데이터를 읽고 쓰는 등의 작업 수행.
 *                          
 * View: 결과화면
 * Controller: 클라이언트 요청과 응답처리, Model과 View 연결
 * 
 * main()-> Controller -> Service -> DAO 참조 순서는 역순? 응답하는 과정 DTO는 사이사이에 껴넣는 느낌..?
 */
public class Java217_Jdbc {

	public static void main(String[] args) {
		DepartmentsController dController = new DepartmentsController();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1 전체, 2 검색어: ");
		int input = Integer.parseInt(sc.nextLine());
		
	
		
		if(input == 1) {
			List<DepartmentsDTO>aList = dController.listAllprocess();
			display(aList);
		}else if(input==2) {
			System.out.print("부서명 입력: ");
			String search = sc.nextLine();
			List<DepartmentsDTO>aList = dController.listSearchProcess(search);
			display(aList);
		}
	}// end main
	
	public static void display(List<DepartmentsDTO>aList) {
		for(DepartmentsDTO dto : aList)
			System.out.printf("%d %s %d %d\n",dto.getDepartment_id(), dto.getDepartment_name(),
					           dto.getManager_id(), dto.getLocation_id());
		
	}

}//end class
