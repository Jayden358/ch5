package jaydenChapter5;
import java.util.Scanner;
public class TestStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String city1;
		String city2;
		String city3;
		String city4;
		String city5;
		String temp;
		//user prompt city one
		System.out.print("Enter The First City: ");
		//user input city one
		city1 = input.nextLine();
		//user prompt city two
		System.out.print("enter the second city: "); 
		//user input city two
		city2 = input.nextLine();
		System.out.print("enter the Third city: "); 
		city3 = input.nextLine();
		System.out.print("enter the Fourth city: ");
		city4 = input.nextLine();
		System.out.print("enter the Fifth city: ");
		city5 = input.nextLine();
		
		// if city one compared to city two < 0
		if (city1.compareTo(city2)>0) {
			temp=city1;
			city1=city2;
			city2=temp;
		}
		if (city2.compareTo(city3)>0) {
			temp=city2;
			city2=city3;
			city3=temp;
			if (city1.compareTo(city2)>0) {
				temp=city1;
				city1=city2;
				city2=temp;
			}
		}
		if (city3.compareTo(city4)>0) {
			temp=city3;
			city3=city4;
			city4=temp;
			if (city2.compareTo(city3)>0) {
				temp=city2;
				city2=city3;
				city3=temp;
				if (city1.compareTo(city2)>0) {
					temp=city1;
					city1=city2;
					city2=temp;
				}
			}
		}
		if (city4.compareTo(city5)>0) {
			temp=city4;
			city4=city5;
			city5=temp;
			if (city3.compareTo(city4)>0) {
				temp=city3;
				city3=city4;
				city4=temp;
				if (city2.compareTo(city3)>0) {
					temp=city2;
					city2=city3;
					city3=temp;
					if (city1.compareTo(city2)>0) {
						temp=city2;
						city1=city2;
						city2=temp;
					}
				}
			}
		}
		System.out.println("The alphabetical order is "+city1+","+city2+","+city3+","+city4+","+city5);
		
		
		//display city in alphabetical order.
		//else
		//swap and display
		
	 }
}

