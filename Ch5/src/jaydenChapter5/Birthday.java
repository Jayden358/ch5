package jaydenChapter5;

import java.util.Scanner;

public class Birthday {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//ints
		final int num128 = 128;
		final int num64 = 64;
		final int num32 = 32;
		final int num16 = 16;
		final int num8 = 8;
		final int num4 = 4;
		final int num2 = 2;
		final int num1 = 1;
		
		//sets
		String set1 ="";
		String set2 ="";
		String set3 ="";
		String set4 ="";
		String set5 ="";
		//var
		String answer1;
		String answer2;
		String answer3;
		String answer4;
		String answer5;
		
		
		//input number
		int inputnum;
		inputnum=0;
		
		//conversion placeholder
		int whatsleft;
		
		
		for(int i=0 ;i<31;i++) {
			String biannum="";
			//System.out.println("enter a number between 0 and 255");
			//inputnum= input.nextInt();
			inputnum = inputnum + 1;
		
		whatsleft = inputnum;
		
		if (inputnum >= num128) {
			whatsleft = inputnum - num128;
			biannum=biannum+"1";
		}
		else {
			biannum = biannum+"0";
		}
		if(whatsleft>= num64) {
			whatsleft = whatsleft - num64;
			biannum = biannum+"1";
		}
		else {
			biannum = biannum+"0";
		}
		if(whatsleft>= num32) {
			whatsleft = whatsleft - num32;
			biannum = biannum+"1";
		}
		else {
			biannum = biannum+"0";
		}
		if(whatsleft>= num16) {
			whatsleft = whatsleft - num16;
			biannum = biannum+"1";
		}
		else {
			biannum = biannum+"0";
		}
		if(whatsleft>= num8) {
			whatsleft = whatsleft - num8;
			biannum = biannum+"1";
		}
		else {
			biannum = biannum+"0";
		}
		if(whatsleft>= num4) {
			whatsleft = whatsleft - num4;
			biannum = biannum+"1";
		}
		else {
			biannum = biannum+"0";
		}
		if(whatsleft>= num2) {
			whatsleft = whatsleft - num2;
			biannum = biannum+"1";
		}
		else {
			biannum = biannum+"0";
		}
		if(whatsleft>= num1) {
			whatsleft = whatsleft - num1;
			biannum = biannum+"1";
		}
		else {
			biannum = biannum+"0";
		
	}
		//display
		//System.out.println("the bianary number for "+inputnum+" is "+ biannum);
		
		//check indexing
		char xnum7 = biannum.charAt(7);
		char xnum6 = biannum.charAt(6);
		char xnum5 = biannum.charAt(5);
		char xnum4 = biannum.charAt(4);
		char xnum3 = biannum.charAt(3);
		
		//sets
		if (xnum7=='1') {
			set1=set1+inputnum+ " ";
		}
		
		if (xnum6=='1') {
			set2=set2+inputnum+ " ";
		}
		
		if (xnum5=='1') {
			set3=set3+inputnum+ " ";
		}
		
		if (xnum4=='1') {
			set4=set4+inputnum+ " ";
		}
		
		if (xnum3=='1') {
			set5=set5+inputnum+ " ";
		}
	
		}
		
		System.out.println("set1 is: "+set1);
		System.out.println("Is your birthday in set 1?");
		answer1 = input.nextLine();
		System.out.println("set2 is: "+set2);
		System.out.println("Is your birthday in set 2?");
		answer2 = input.nextLine();
		System.out.println("set3 is: "+set3);
		System.out.println("Is your birthday in set 3?");
		answer3 = input.nextLine();
		System.out.println("set4 is: "+set4);
		System.out.println("Is your birthday in set 4?");
		answer4 = input.nextLine();
		System.out.println("set5 is: "+set5);
		System.out.println("Is your birthday in set 5?");
		
		answer5 = input.nextLine();
		int birthday = 0;
		if (answer1.equals("yes")) {
			birthday = birthday+1;
		}

		if (answer2.equals("yes")) {
			birthday = birthday+2;
		}

		if (answer3.equals("yes")) {
			birthday = birthday+4;
		}

		if (answer4.equals("yes")) {
			birthday = birthday+8;
		}

		if (answer5.equals("yes")) {
			birthday = birthday+16;
		}

		System.out.println("You're birthday is " + birthday);
	}
}
