package java012_api.part04;

public class Java118_Object_clone {

	public static void main(String[] args) {
		House house = new House("홍길동", 30, new Address("서울"));
		//House copy = house.shallowCopy();
		House copy = house.deepCopy();
		System.out.println(house);
		System.out.println(copy);
		System.out.printf("house.name=%s, house.age=%d, house.address=%s\n", house.name, house.age, house.address);
		System.out.printf("copy.name=%s, copy.age=%d\n, copy=address=%s\n", copy.name, copy.age,copy.address);
		System.out.printf("house.address.city=%\n", house.address.city);
		System.out.printf("copy.address.city=%\n", house.address.city);
		
		house.name = "김민재";
		house.address.city = "제주";
		System.out.printf("house.name=%s, house.age=%d, house.address=%s\n", house.name, house.age, house.address);
		System.out.printf("copy.name=%s, copy.age=%d\n, copy=address=%s\n", copy.name, copy.age,copy.address);
		System.out.printf("house.address.city=%\n", house.address.city);
		System.out.printf("copy.address.city=%\n", house.address.city);

	}

}
