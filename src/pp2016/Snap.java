package pp2016;

public class Snap
{
	private Deck snapDeck;
	private final Hand hand1;
	private final Hand hand2;
	private int snaps;


	public Snap()
	{
		hand1 = new Hand();
		hand2 = new Hand();
	}


	private static int getValue(String card)
	{
		return Integer.parseInt(card.substring(1));
	}


	private void initialise()
	{
		snapDeck = Deck.fullDeck();
		snapDeck.randomOrder();
		snaps = 0;
	}


	private void deal()
	{
		for(int i = 0; i < 52; i++) {
			String card = snapDeck.dealCard();
			if(hand1.getSize() > hand2.getSize()) {
				hand2.addCard(card);
			}
			else {
				hand1.addCard(card);
			}
		}
	}


	public void play()
	{
		initialise();
		deal();

		// play
		while(hand1.getSize() > 0 && hand2.getSize() > 0) {
			if(getValue(hand1.getCard()) == getValue(hand2.getCard())) {
				snaps++;
			}
		}

		System.out.println(snaps);
	}
}