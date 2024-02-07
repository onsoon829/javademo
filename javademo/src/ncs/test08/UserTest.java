package ncs.test08;

public class UserTest {

	public static void main(String[] args, char M, char F) {
		User[]User = new User[3];
		User[0] = new User("user01", "pass01","김철수", 32, M, "010-1234-5678");
		User[1] = new User("user02", "pass02","이영희", 25, F, "010-5555-7777");
		User[2] = new User("user03", "pass03","황진이", 20, F, "010-9874-5632");
		
		for(User users : User)
			System.out.println(users.toString());
		
		
		//User[]copyUsers = new User[users.length];

	}
	


}
