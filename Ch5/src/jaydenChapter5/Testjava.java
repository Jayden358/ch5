package jaydenChapter5;
//jayden Williams
//11/18
import java.util.Scanner;
public class Testjava {
	
	public static void main(String[] args) {
		
		String message = "welcome to java";
		String message2 ="java is fun";
		System.out.println(message.length());
		System.out.println("welcome to Java".length());
		System.out.println(message.charAt(8));
		System.out.println(message+message2);
		System.out.println(message.concat(message2));
		
		message += " and Java is fun";
		
		message += message2;
		
		message = message+message2;
		
		Scanner input = new Scanner(System.in);
		String x =input.next();
		x =input.nextLine();
		if (message.equals("welcome to java")) {
			System.out.println("you're in");
			
		}
		else {
			System.out.println("you're not in");
		}
	}

}
