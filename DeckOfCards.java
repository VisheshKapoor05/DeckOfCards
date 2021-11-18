package DeckOfCards;

public class DeckOfCards {

	public static void main(String[] args) {
		
		RandomCards obj = new RandomCards();
		int suit;
		int rank;
		String suitName = null;
		String rankName;
		
		for(int i=0; i<4;)
		{
			suit = (int) Math.floor(Math.random()*10)%4;
			if(obj.cards_array.contains(suit))
			{
			}
			else
			{
				suitName = obj.suit_name(suit);
				//obj.cards_array.get(i).suit_name = suitName;
				i++;
			}
			
			for(int j=0; j<13;)
			{
				rank = (int) Math.floor(Math.random()*10)%13;
				boolean b = obj.cards_array.contains(rank);
				if(b == false )
				{
					rankName = obj.rank_name(rank);
					//obj.cards_array.get(j).rank_name = rankName;
					obj.cards_value(suitName, rankName);
					obj.cards_array.add(obj);
					j++;
				}
			}
		}
		
		for(int i=0; i<obj.cards_array.size(); i++)
		{
			System.out.println(obj.cards_array);
		}

	}

}
