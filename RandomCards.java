package DeckOfCards;

import java.util.ArrayList;

public class RandomCards {
	
	static ArrayList<RandomCards> cards_array=new ArrayList<RandomCards>();
	int suit;
	int rank;
	String suit_name = null;
	String rank_name = null;
		
	@Override
	public String toString() {
		return "RandomCards [suit_name=" + suit_name + ", rank_name=" + rank_name + "]";
	}
	
	public String getSuit_name() {
		return suit_name;
	}

	public void setSuit_name(String suit_name) {
		this.suit_name = suit_name;
	}

	public String getRank_name() {
		return rank_name;
	}

	public void setRank_name(String rank_name) {
		this.rank_name = rank_name;
	}

	public void cards_value(String suit, String rank) {
		String random_suit = suit;
		String random_rank = rank;
	}
	
	public String suit_name(int suit) {
		
		switch (suit) {
		case 0:
			suit_name = "Clubs";
			break;
		case 1:
			suit_name = "Diamonds";
			break;
		case 2:
			suit_name = "Hearts";
			break;
		case 3:
			suit_name = "Spades";
			break;
		}
		
		return suit_name;
	}
	
	
	public String rank_name(int rank) {
		
		switch (rank) {
		case 0:
			rank_name = "2";
			break;
		case 1:
			rank_name = "3";
			break;
		case 2:
			rank_name = "4";
			break;
		case 3:
			rank_name = "5";
			break;
		case 4:
			rank_name = "6";
			break;
		case 5:
			rank_name = "7";
			break;
		case 6:
			rank_name = "8";
			break;
		case 7:
			rank_name = "9";
			break;
		case 8:
			rank_name = "10";
			break;
		case 9:
			rank_name = "Jack";
			break;
		case 10:
			rank_name = "Queen";
			break;
		case 11:
			rank_name = "King";
			break;
		case 12:
			rank_name = "Ace";
			break;
		}
		
		return rank_name;
	}
}
