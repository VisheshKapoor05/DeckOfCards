package DeckOfCards;

import java.util.ArrayList;

public class Cards {
	public static void main(String[] args) {
		String[][] arr = new String[4][13];
		
		int suit;
		int rank;
		
		String [] rankArray = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		String [] suitArray = {"Clubs", "Diamonds", "Hearts", "Spades"};
		
		//Storing all the cards in a 2d array
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<13; j++)
			{
				arr[i][j]= suitArray[i] + " " + rankArray[j];
			}
		}
		
		
		//Selecting 9 unque random cards to be distributed
		String random_card;
		String[] selected_cards = new String[10];
		
		for(int i=1; i<10;)
		{
			suit = (int) Math.floor(Math.random()*10)%4;
			rank = (int) Math.floor(Math.random()*10)%13;
			random_card= arr[suit][rank];
			int a=0;
			for(int j=0; j<i; j++)
			{
				if(random_card.equals(selected_cards[j]))
				{
					a=0;
				}
				else
				{
					a=1;
				}
			}
			if(a==1)
			{
				selected_cards[i]=random_card;
				System.out.println(selected_cards[i]);
				i++;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		//Distributing 9 cards to 4 persons
		ArrayList p1 = new ArrayList();
		ArrayList p2 = new ArrayList();
		ArrayList p3 = new ArrayList();
		ArrayList p4 = new ArrayList();
		for(int i=0; i<9; i++)
		{
			int person = (int) Math.floor(Math.random()*10)%4;
				switch (person) {
				case 0:
					p1.add(selected_cards[i]);
					break;
				case 1:
					p2.add(selected_cards[i]);
					break;
				case 2:
					p3.add(selected_cards[i]);
					break;
				case 3:
					p4.add(selected_cards[i]);
					break;
			}
		}
		for(int i=0; i<p1.size(); i++)
			System.out.println("P1 cards: " +p1.get(i));
		
		System.out.println();
		
		for(int i=0; i<p2.size(); i++)
			System.out.println("P2 cards: " +p2.get(i));
		
		System.out.println();
		
		for(int i=0; i<p3.size(); i++)
			System.out.println("P3 cards: " +p3.get(i));
		
		System.out.println();
		
		for(int i=0; i<p4.size(); i++)
			System.out.println("P4 cards: " +p4.get(i));
		
		
	}
}
