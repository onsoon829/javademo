package ncs.test07;

public class Human {
	String name;
	int age;
	int height;
	int weight;



public Human(){
	
}

public Human(String name, int age, int height, int weight) {
	      super();
	      this.name = name;
	      this.age = age;
	      this.height = height;
	      this.weight = weight;
}

public String getname() {
	return name;
}

public void setname(String name) {
	this.name = name;
}

public int getage() {
	return age;
}

public void setage(int age) {
	this.age = age;
}
public int getheight() {
	return height;
}

public void setheight(int height) {
	this.height = height;
}
public int getweight() {
	return weight;
}

public void setweight(int weight) {
	this.weight = weight;
}

//override, string format 사용 가능
}