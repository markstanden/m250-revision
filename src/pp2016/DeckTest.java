package pp2016;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest extends ConsoleTest
{

	@Test
	void fullDeck()
	{
		Deck sut = Deck.fullDeck();
		assertEquals(52,
		             sut.getCards()
		                .size());
	}


	@Test
	void createStandardDeck_CorrectSize()
	{
		assertEquals(52,
		             Deck.createStandardDeck()
		                 .size());
	}


	@ParameterizedTest
	@ValueSource(strings = {"S1", "S2", "S10", "S11", "S12", "S13", "H1", "H13", "C1", "C13", "D1", "D13"})
	void createStandardDeck_ShouldContain(String card)
	{
		Set<String> sut = Deck.createStandardDeck();
		assertTrue(sut.contains(card));
	}


	@ParameterizedTest
	@ValueSource(strings = {"", "S", "H", "C", "D", "S0", "S14", "H0", "H14", "C0", "C14", "D0", "D14"})
	void createStandardDeck_ShouldNotContain(String card)
	{
		Set<String> sut = Deck.createStandardDeck();
		assertFalse(sut.contains(card));
	}
}