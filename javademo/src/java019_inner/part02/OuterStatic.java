package java019_inner.part02;

public class OuterStatic {
	private int x;
	static private int y;
	
	static void call() {//static 선언된 곳에 값이 비어있는 비static 변수는 사용 불가능
		//x = 30;// 지역 외부 변수?외부 클래스?
		y = 9;
		System.out.println(y);
	}
	
	
	static class InnerStatic{
		int z;
		void prn() {
			//비 static 외부자원을 static 내부클레서에서 참조할 수 없다.zzzzz..
			//x = 50;
			y = 20;
			z = 40;
			System.out.printf("y=%d, z=%d\n", y, z);
		}
	}


	

}
