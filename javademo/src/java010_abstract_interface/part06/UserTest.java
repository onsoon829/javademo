package java010_abstract_interface.part06;

public class UserTest extends User implements Print, Score {
	private int s;
	public UserTest() {

	}

	public UserTest(String name, int s) {
		super(name);
		this.s = s;
	}

	@Override
	public int getScore() {
		return sol * s;
	}

	@Override
	public String toPaint() {
		return String.format("이름 : %s\n점수 : %d점\n",toString(), getScore() );
	}

}
