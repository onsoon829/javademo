package java009_inheritance.part06;

public class DogOver extends PetOver{
	public DogOver() {
		
	}
	//부모는 여러 자식에게 상속 가능
	@Override
	public void move() {
	    System.out.println("서브클래스() : 개가 걸어갑니다");
	}

}
