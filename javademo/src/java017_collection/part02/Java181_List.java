package java017_collection.part02;

public class Java181_List {

	public static void main(String[] args) {
		UserList us = new UserList();
		//append
		us.add(10);
		us.add(20);
		us.add(30);
		us.add(40);
		
		//insert
		us.add(1, 50);//1번째 자리에 50 넣어라.그럼 기존값들이 뒤에 하나씩 밀린다
		us.add(5, 60);//5번째 자리에 60 넣어라
		us.add(5, 70);//5번째 자리에 70 넣어라.
		
		
		System.out.println(us.get(0));
		System.out.println(us.get(1));
		System.out.println(us.get(2));
		System.out.println(us.get(3));
		System.out.println(us.get(4));
		System.out.println(us.get(5));
		System.out.println(us.get(6));//값이 없어 오류 남
		
		System.out.println("//remove/////");
		us.remove(0);
		System.out.println(us.get(0));
		System.out.println(us.get(1));
		System.out.println(us.get(2));
		
		System.out.println("//size()//");
		System.out.println(us.size());
		////////////////////////////////////////
	}//end main

}//end class
