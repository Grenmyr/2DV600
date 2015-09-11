package Game123;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import Deck.Card;
import Deck.Deck;

public class Play123Main {
	private HashMap<Integer , ArrayList<Card>> all123Sets = new HashMap<Integer,ArrayList<Card>>();
	private int wins =0;
	private static final int tenThousandSets = 10000;
	public Play123Main() {
		
		setGame(tenThousandSets);	
		System.out.println("Probability was computed to : "+probability()+" % chance to win game.");
	}
	
	private void setGame(int sets ){
		
		for(int n = 0; n <=sets; n++){
			Deck deck = new Deck();
			ArrayList<Card> list = new ArrayList<Card>();
			for(int i = 0; i <=2; i++){			
				list.add(deck.handOutNextCard());
			}
			all123Sets.put(n, list);
		}
		
	}
	
	public double probability (){
		Set<Integer> keys = all123Sets.keySet();
		for (Integer key : keys) {
			if(play123(key) == true){
				setWin();
			}
		}			
		return (double)getWin()/(double)tenThousandSets / 100;
	}
	
	public void setWin(){
		wins +=1;
	}
	
	public int getWin(){
		return wins;
	}
	
	private Boolean play123(int key){
	 	ArrayList<Card> oneTwoThree = all123Sets.get(key);
			 
		 if(oneTwoThree.get(0).getRank() == Card.Rank.ACE || oneTwoThree.get(1).getRank() == Card.Rank.TWO || oneTwoThree.get(2).getRank() == Card.Rank.THREE){
			 return false;
		 } 	 
	       	
		 return true;
	}

	public static void main(String[] args) {	
		new Play123Main();		
	}

}
