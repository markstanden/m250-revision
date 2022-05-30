package pp2013;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BulbCatalogueTest
{

	@Test
	void updateCatalogueExpected()
	{
		var sut = new BulbCatalogue();
		sut.populateCatalogue();
		assertEquals("Sparky",
		             sut.getCatalogue()
		                .get(10));
		assertEquals("BrightGuy",
		             sut.getCatalogue()
		                .get(200));
		assertEquals("Neverlast",
		             sut.getCatalogue()
		                .get(911));
		assertEquals("Blinker",
		             sut.getCatalogue()
		                .get(42));
		sut.updateCatalogue();
		assertEquals("Sparky - economy",
		             sut.getCatalogue()
		                .get(10));
		assertEquals("BrightGuy",
		             sut.getCatalogue()
		                .get(200));
		assertEquals("Neverlast",
		             sut.getCatalogue()
		                .get(911));
		assertEquals("Blinker - economy",
		             sut.getCatalogue()
		                .get(42));
	}


	@Test
	void updateCatalogueEmpty()
	{
		var sut = new BulbCatalogue();
		sut.updateCatalogue();
		assertEquals(new HashMap<Integer, String>(), sut.getCatalogue());
	}
}