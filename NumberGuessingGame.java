import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {

	public static void main (String args[]) {
		
		Random random = new Random ();
		Scanner input = new Scanner (System.in);
		
		int generateNumber = random.nextInt(101);
		
		System.out.print ("Guess the Integer number from 0 to 100: ");
		int guessNumber = input.nextInt();
		
		while (guessNumber!=generateNumber) {
			
			if (guessNumber > generateNumber) {
				System.out.println ("\n\tOops, Too High");
			} else if (guessNumber < generateNumber) {
				System.out.println ("\n\tOops, Too Low");
			} 
			
			System.out.print ("\nGuess the Integer number from 0 to 100: ");
			guessNumber = input.nextInt();
		
		}
		
		System.out.println ("\n\tCongrats! You are correct.");
		
		input.close();    
	}

}
