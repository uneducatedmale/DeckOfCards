/**********************************************************
* Program Name   : TestNames
* Author         : Mike Chuvik
* Date           :
* Course/Section : CSC 112
* Program Description: methods to be used in class TestNames to
* format 2 sets of First Middle Last names.
*
* Methods: deck, shuffle, dealOne, cardsLeft
* -------
*
*
* @author Mike Chuvik
* @version 1.0
* @since 2022-02-14
**********************************************************/

import java.util.Random;

public class DeckOfCards
{
	//class variables
	private Card deck[];  //array of card objects
	private int currentCard;
	private final int DECK_SIZE = 52;
	private Random generator = new Random();

	/**********************************************************
	* Method Name    : DeckOfCards
	* Author         :
	* Date           :
	* Course/Section : CSC112
	* Program Description: Constructor for DeckOfCards class
	*
	* BEGIN DeckOfCards
	* 	instantiate deck array
	*   set currentCard to 0
	*   FOR(count = 0; count < deck size; increment count)
	*   	create a card object for deck array at count address
	*	END FOR
	* END DeckOfCards
	**********************************************************/
	public DeckOfCards()
	{
		deck = new Card [DECK_SIZE];
		currentCard = 0;

		for(int i = 0; i < DECK_SIZE; i++)
		{
			deck[i] = new Card();
		}//end for


	}//end constructor


	/**********************************************************
	* Method Name    : shuffle
	* Author         :
	* Date           :
	* Course/Section : CSC112
	* Program Description: Shuffles all cards by switching cards 52 times
	*
	* BEGIN shuffle
	*    FOR(card one = 0; card one < deck size; increment card one)
	*	 	switch card = generate random num 1-52
	*    	Card object = deck(card one)
	*		deck(card one) = deck(switch card)
	*    END FOR
	* END firstMiddleLast
	**********************************************************/
	public void shuffle()
	{
		//local constants

		//local variables
		int altCard;
		int firstCard;

		for(firstCard = 0; firstCard < DECK_SIZE; firstCard++)
		{
			altCard = generator.nextInt(51) + 1;
			Card temp = deck [firstCard];
			deck[firstCard] = deck[altCard];
		}//end for



	}

	/**********************************************************
	* Method Name    : dealOne
	* Author         :
	* Date           :
	* Course/Section : CSC112
	* Program Description: draws out one card from the deck array
	*
	* BEGIN dealOne
	*    IF(current card < deck size)
	*	 	return deck(current card and increment current card)
	*	 END IF
	*    ELSE
	*    	return null
	* END dealOne
	**********************************************************/
	public Card dealOne()
	{
		//local constants

		//local variables

		if(currentCard < DECK_SIZE)
		{
			return deck[currentCard++];
		}
		else
		{
			return null;
		}

	}

	/**********************************************************
	* Method Name    : cardsLeft
	* Author         :
	* Date           :
	* Course/Section : CSC112
	* Program Description: returns a number for how many card objects
	* are left in the deck array
	*
	* BEGIN cardsLeft
	* 	number of cards left = deck size - current card
	*	return number of cards left
	* END cardsLeft
	**********************************************************/
	public int cardsLeft()
	{
		//local constants

		//local variables
		int numLeft;

		numLeft = DECK_SIZE - currentCard;
		return numLeft;

	}


}