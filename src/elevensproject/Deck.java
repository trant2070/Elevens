package elevensproject;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//make a Deck class
public class Deck
{

	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards;
	private int size;

        
        
        public Deck(String[] ranks, String[] suits, int[] values) 
        {
            for(int i = 0; i < suits.length; i++)
            {
                for(int j = 0; j < ranks.length; j++)
                {
                cards.add(new Card(suits[i],values[j]));
                size++;
                }
            }
            shuffle();
        }
   //make a Deck constructor
   	//refer cards to new ArrayList
   	//set top to the top of the deck 51
   	
   	//loop through all suits
   		//loop through all faces 1 to 13
   			//add a new TwentyOneCard to the deck

        public boolean isEmpty() 
        {
            if(size == 0)
            {
                return true;
            }   
            else
            {
                return false;
            }
        }
   
        public int size() 
        {
            return size;
	}
   
   //make a dealCard() method that returns the top card
        public Card dealCard() 
        {
            if (isEmpty()) 
            {
               	return null;
            }
            size--;
            Card c = cards.get(size);
            return c;
	}
   //write a shuffle() method
   	//use Colletions.shuffle
   	//reset the top card 
        public void shuffle() 
        {
            for (int k = cards.size() - 1; k > 0; k--) 
            {
                int howMany = k + 1;
                int start = 0;
                int randPos = (int) (Math.random() * howMany) + start;
                Card temp = cards.get(k);
                cards.set(k, cards.get(randPos));
                cards.set(randPos, temp);
            }
                size = cards.size();
        }

}