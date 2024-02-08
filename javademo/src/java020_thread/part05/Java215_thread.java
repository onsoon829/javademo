package java020_thread.part05;
//집: 프로세스
	//스레드: 가족 구성원
	//공유자원: 욕실(Washroom)
public class Java215_thread {

	public static void main(String[] args) {
		Washroom wr = new Washroom();
		
		FamilyThread father = new FamilyThread(wr, "father");
		FamilyThread mother = new FamilyThread(wr, "mother");
		FamilyThread sister = new FamilyThread(wr, "brother");
		FamilyThread brother = new FamilyThread(wr, "brother");
		
		father.start();
		mother.start();
		sister.start();
		brother.start();
		

	}//end main

}//end class
