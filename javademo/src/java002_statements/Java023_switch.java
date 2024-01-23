package java002_statements;

public class Java023_switch {

	public static void main(String[] args) {
		String color = "yellow";
		
		switch(color) {
		case "red":
			System.out.println("#ff0000");  //#redgreenblue
			break;
		case "green":
			System.out.println("#00ff00");
			break;
		case "blue":
			System.out.println("#0000ff");
			break;
		case "black":
			System.out.println("#000000");
			break;
		case "white":
			 System.out.println("#ffffff");
		}

	}//end main()

}//end class
