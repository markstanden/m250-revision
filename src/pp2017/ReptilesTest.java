package pp2017;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReptilesTest extends ConsoleTest
{

	@Test
	void addLizard()
	{
		Reptiles sut = new Reptiles();
		sut.addLizard("Test1");
		sut.addLizard("Test2");
		sut.addLizard("Test3");
		assertEquals(3, sut.howManySpecies());
		sut.addLizard("Test1");
		sut.addLizard("Test2");
		sut.addLizard("Test3");
		assertEquals(3, sut.howManySpecies());
		sut.addLizard("Test1");
		sut.addLizard("Test2");
		sut.addLizard("Test3");
		assertEquals(3, sut.howManySpecies());
	}


	@Test
	void doIHaveIt()
	{
		Reptiles sut = new Reptiles();
		assertFalse(sut.doIHaveIt("Test1"));
		assertFalse(sut.doIHaveIt("Test2"));
		assertFalse(sut.doIHaveIt("Test3"));
		sut.addLizard("Test1");
		sut.addLizard("Test2");
		sut.addLizard("Test3");
		assertTrue(sut.doIHaveIt("Test1"));
		assertTrue(sut.doIHaveIt("Test2"));
		assertTrue(sut.doIHaveIt("Test3"));
		assertFalse(sut.doIHaveIt("Test4"));
	}


	@Test
	void update()
	{
		Reptiles sut = new Reptiles();
		sut.addLizard("Uromastyx Moroccan");
		sut.addLizard("Uromastyx Moroccan");
		assertEquals(1, sut.howManySpecies());
		assertFalse(sut.doIHaveIt("Uromastyx Egyptian"));
		sut.update("Uromastyx Moroccan", 2, "Uromastyx Egyptian");
		assertEquals(2, sut.howManySpecies());
		assertTrue(sut.doIHaveIt("Uromastyx Egyptian"));
	}


	@Test
	void removeLizard()
	{
		Reptiles sut = new Reptiles();
		sut.addLizard("Uromastyx Moroccan");
		sut.addLizard("Uromastyx Moroccan");
		sut.addLizard("Test1");
		sut.addLizard("Uromastyx Moroccan");
		sut.addLizard("Test2");
		sut.addLizard("Uromastyx Moroccan");
		sut.addLizard("Test3");
		assertEquals(4, sut.howManySpecies());
		assertFalse(sut.doIHaveIt(""));

		sut.removeLizard("Uromastyx Moroccan", 3);
		assertEquals(4, sut.howManySpecies());
		assertEquals("Test1", sut.myLizards.get(2));
		assertEquals("Test2", sut.myLizards.get(3));

		sut.removeLizard("Uromastyx Moroccan", 3);
		assertEquals(4, sut.howManySpecies());
		assertEquals("Test1", sut.myLizards.get(2));
		assertEquals("Test2", sut.myLizards.get(3));
		assertEquals("Test3", sut.myLizards.get(4));
	}
}