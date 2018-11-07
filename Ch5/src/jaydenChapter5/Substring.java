package jaydenChapter5;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
	 
		
		String message = "Welcome to Java";
		
		System.out.println(message);
		System.out.println(message.indexOf("J"));
		System.out.println(message.indexOf("a",13));
		System.out.println(message.indexOf("to"));
		System.out.println(message.lastIndexOf("to"));
		
		char name = '0';
		Scanner input = new Scanner(System.in);
		System.out.println("enter your first and last name");
		name = input.nextLine().charAt(0);
		if (name.isDigit()) {
		int name1 = Integer.parseInt(name);
		}
		else {
			System.out.println("that is not a number");
		}
		double name1 = Double.parseDouble(name);
		
		
		
		
		
		
		
		
		/*int space = name.indexOf(" ");
		String firstName = name.substring(0,space);
			
				String lastName = name.substring(space+1);
				System.out.println(firstName);
				System.out.println(lastName);
				*/
	}

}
