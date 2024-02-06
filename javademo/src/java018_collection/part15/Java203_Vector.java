package java018_collection.part15;

import java.util.Vector;

public class Java203_Vector {

	public static void main(String[] args) {
		Vector<String>vt = new Vector<String>();
		vt.add("java");
		vt.add("jsp");
		vt.add("spring");
		vt.add("oracle");
		vt.add("mysql");
		System.out.println(vt.toString());
		
		vt.remove(0);//0번째에 있는 거 삭제
		System.out.println(vt.toString());
		
		Vector<String>vm = new Vector<String>();
		vm.add("oracle");
		vm.add("mysql");
		vm.add("mssql");
		
		vt.removeAll(vm);
		System.out.println(vt.toString());
		
		//boolean removeAll(Colllection<?>c);
		Vector<Integer> vn = new Vector<Integer>();
		vn.add(10);
		vn.add(20);
		vt.removeAll(vn);
		System.out.println(vt.toString());
		
		vt.removeAll(vt);//vt에 저장된 모든 걸 삭제해라
		System.out.println(vt.toString());
		
		

	}//end main

}//end class
