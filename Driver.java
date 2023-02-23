/**********************************************************
* Program Name   : Driver
* Author         : Mike Chuvik
* Date           :
* Course/Section : CSC 112
* Program Description: User has 3 choices, to either draw a card and show
* its information, to show how many cards are left, or to quit the program
*
* Methods: main
* -------
*
*
* @author Mike Chuvik
* @version 1.0
* @since 2022-02-14
**********************************************************/

import java.util.Scanner;

public class Driver
{
	/**********************************************************
	* Method Name    : main
	* Author         :
	* Date           :
	* Course/Section : CSC112
	* Program Description: Constructor of NameForm class
	*
	* BEGIN main
	*    print out options of user
	* 	 prompt user for input
	*    WHILE(input != quit)
	*	 	IF(input == draw)
	*			print draw method
	*		END IF
	*		IF(input == check left)
	* END main
	**********************************************************/
	public static void main (String args[])
	{
		//local constants
		final int DRAW = 1;       //user input of dealing one card
		final int CHECK_LEFT = 2; //user input to check # cards left
		final int QUIT = 3;       //user input to quit program
		//local variables
		int input;           //users input
		int numCardsLeft;    //number of cards left in the deck array
		Scanner scan = new Scanner(System.in);  //scanner object to read input

		//instantiate deck array into main and shuffle the deck
		DeckOfCards myDeck = new DeckOfCards();
		myDeck.shuffle();

		//show users options
		System.out.print("\n\n\n\tDeck of cards!!!");
		System.out.print("\n\n\tUser choices (input one of these 3 numbers");
		System.out.print("\n\t1 = draw a card and display info");
		System.out.print("\n\t2 = check how many cards are left in the deck to draw");
		System.out.print("\n\t3 = quit program");

		//prompt user for input
		System.out.print("\n\n\tInput choice: ");
		input = scan.nextInt();

		//loop for user to continually draw cards, check for # of cards left, or quit entirely
		while(input != QUIT)
		{
			if(input == DRAW)
			{
				System.out.print("\n\t" + myDeck.dealOne());
			}

			if(input == CHECK_LEFT)
			{
				numCardsLeft = myDeck.cardsLeft();
				System.out.print("\n\tNumber of cards left: " + numCardsLeft);
			}
			System.out.print("\n\n\n\tInput choice: ");
			input = scan.nextInt();

		}//end while

		//message to show you quit the prog
		System.out.print("\n\n\tYou have quit the program...\n\n\n\n\n\n\n\n");

	}//end main

}//end Driver


