package java010_abstract_interface.part01;

public class SenndaAbs extends CarAbs{ //추상클래스를 상속받고 아무것도 안하면 오류나옴, 추상메서드를 오버라이딩 해주면 해결됨
	
	public SenndaAbs() {
	}

	@Override // 추상 메서드 오버라이드 / 빈 공간에 ctrl+space 하면 제일위에 나옴 // 현재는 work
	public void work() {
		System.out.println("승용차가 사람을 태우고 있습니다.");
		
	}







}
