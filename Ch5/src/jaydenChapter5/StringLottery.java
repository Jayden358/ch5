package jaydenChapter5;

import java.util.Scanner;

public class StringLottery {

	public static void main(String[] args) {
		//generate a lottery number
		
		int lottery = (int)(Math.random() * 100);
		
		//Prompt the user to guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (2 digits): ");
		int guess = input.nextInt();
		
		// get digits from lottery
		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;
		
		//get digits from guess
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		System.out.println("The lottery number is " + lottery);
		
		if (guess == lottery) {
			System.out.println("Exact match: you win $10,000");
		}
		else if (guessDigit2 == lotteryDigit1 &&
				guessDigit1 == lotteryDigit2) {
			System.out.println("Match all digits: you win $3,000");
		}
		else if (guessDigit1 == lotteryDigit1
				|| guessDigit1 == lotteryDigit2
				|| guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2) {
			System.out.println("match one digit: you win $1,000");
			
		}
		else {
			System.out.println("sorry, no match");
		}
	}
	
	}
	


	


