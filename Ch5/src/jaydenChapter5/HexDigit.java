package jaydenChapter5;
import java.util.Scanner;
public class HexDigit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a hex digit 0-9 and A-F");
		String hexString = input.nextLine();
		
		if (hexString.length() >= 4) {
			System.out.println("You must enter at most 3 Characters");
			System.exit(1);
		}
		char ch = Character.toUpperCase(hexString.charAt(0));
		if (ch <='F' && ch>='A') {
			int value = ch -'A'+10;
			System.out.println("the decimal value for hex digit " + ch +" is "+value);
		}
		else if (Character.isDigit(ch)) {
			System.out.println("the decimal value for hex digit " + ch +" is "+ ch);
		}
		else {
			System.out.println(ch+" is an invalid input");
		}
	}

}
