package java021_jdbc.part03;

import java.util.List;

public class MemController {
	private MemService service;
	
	public MemController() {
		service = new MemService();
	}
	
	public int insertProcess(MemDTO dto) {
		return service.getInsert(dto);
	}
	
	public List<MemDTO> listProcess(){
		return service.getMemList();
	}
	//main에서 사용되도록 넘기기
	

}//end class