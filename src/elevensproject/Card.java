package elevensproject;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
	private String suit;
        private int face;
        private String rank;
	
        //private String rank;
        
        //rank of suit (point value = pointValue)

  	//constructors
        public Card(String cardSuit, int cardFace) 
        {
            
            suit = cardSuit;
            face = cardFace;
	}
        

	// modifiers
		//set methods
        public void setSuit(String s)
        {
            suit = s;
        }
        
        public void setFace(int f)
        {
            face = f;
        }
  	//accessors
		//get methods
        public String getSuit()
        {
            return suit;
        }
        
        public int getFace()
        {
            return face;
        }

  	//toString
        public String toString()
        {
            return FACES[face] + " of " + suit;
        }
 }