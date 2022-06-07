package pp2019;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerformerTest extends ConsoleTest
{

	@Test
	void isInSameBranchAs()
	{
		Branch test = new Branch("TestBranch");
		Performer sut = new Performer("Test");
		Performer other = new Performer("Test2");
		Performer another = new Performer("Test3");
		sut.setBranch(test);
		other.setBranch(test);
		assertTrue(sut.isInSameBranchAs(other));
		assertFalse(sut.isInSameBranchAs(another));
	}


	@Test
	void getFirstName()
	{
		Performer sut = new Performer("Testing One Two Three");
		assertEquals("Testing", sut.getFirstName());
	}


	@Test
	void testEquals()
	{
		Performer sut = new Performer("Testing One Two Three");
		sut.setBranch(new Branch("Test1"));
		Performer other = new Performer("Testing One Two Three");
		other.setBranch(new Branch("Test2"));
		Performer another = new Performer("Testing One Two");
		other.setBranch(new Branch("Test3"));

		assertTrue(sut.equals(other));
		assertFalse(sut.equals(another));
	}
}