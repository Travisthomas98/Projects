import java.util.Scanner; 
public class Input123 {

	public static void main(String[] InputAssignment) {
		//Setting up scanner
		Scanner sc = new Scanner(System.in);
		
		
		

		int input;
		do {
		System.out.println("Please enter 1, 2, 3, or 4.");
		input = sc.nextInt();

		switch(input) {
		case 1:
		case 2:
		case 3:
			System.out.println("Good job!!");
			break;
		case 4:
			System.exit(0);
			break;
			default:
				System.out.println("Error! Enter 1, 2, 3, or 4 only please.");
				break;
		}
		
		}
		while( input != 4 ); 
	}
}
