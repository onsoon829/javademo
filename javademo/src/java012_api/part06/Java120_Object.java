package java012_api.part06;

import java.util.Arrays;

public class Java120_Object {

	public static void main(String[] args) {
		Rect[]rect = new Rect[3];
		rect[0] = new Rect(2,5);
		rect[1] = new Rect(1,4);
		rect[2] = new Rect(3,2);
		
		Rect[]copy = rect;//주소 복사
		//Rect[]copy = rect.clone();//배열에서 제공된 클론
		for(int i=0; i<copy.length; i++) {
			copy[i] = copy[i].clone();
			System.out.println(copy[i]);
		}
		// copy는 복사, clone은 복사 붙여넣기 ㄷㄷㄷㄷㄷㄷㄷㄷ
		rect[0] = new Rect(2,6);
		System.out.println(Arrays.toString(rect));//주소 출력
		for(Rect r : rect)
			System.out.println(r.getArea());//Rect.java의 getArea 호출해서 계산.
		
		System.out.println(Arrays.toString(copy));//주소 복사.
        for(Rect r : copy)
        	System.out.println(r.getArea());
	}

}
