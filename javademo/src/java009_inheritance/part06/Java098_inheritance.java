package java009_inheritance.part06;

//부모는 여러 자식에게 상속 가능

public class Java098_inheritance {

	public static void main(String[] args) {
		PetOver pet = new PetOver();
		pet.move();
		
		DogOver dog = new DogOver();
		dog.move();
		
		BirdOver bird = new BirdOver();
		bird.move();

	}

}
