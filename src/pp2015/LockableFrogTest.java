package pp2015;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LockableFrogTest extends ConsoleTest
{

	@Test
	void setPositionTest_Locked()
	{
		LockableFrog sut = new LockableFrog("1");
		int currentPos = sut.getPosition();
		sut.lock();
		sut.right(4);
		assertEquals(currentPos, sut.getPosition());
	}


	@Test
	void setPositionTest_unLocked()
	{
		LockableFrog sut = new LockableFrog("1");
		int currentPos = sut.getPosition();
		sut.unlock("1");
		sut.right(4);
		assertEquals(currentPos + 4, sut.getPosition());
	}


	@Test
	void unlockTest()
	{
		LockableFrog sut = new LockableFrog("1");
		sut.lock();
		assertTrue(sut.isLocked());
		sut.unlock("0");
		assertTrue(sut.isLocked());
		sut.unlock("1");
		assertFalse(sut.isLocked());
	}


	@Test
	void unlockAfterThreeFailsTest()
	{
		LockableFrog sut = new LockableFrog("1");
		sut.lock();
		assertTrue(sut.isLocked());
		sut.unlock("0");
		assertTrue(sut.isLocked());
		sut.unlock("0");
		assertTrue(sut.isLocked());
		sut.unlock("0");
		assertTrue(sut.isLocked());
		sut.unlock("1");
		assertTrue(sut.isLocked());
		assertEquals("Attempts exhausted", getStrippedConsole());
	}


	@Test
	void unlockThirdTimeTest()
	{
		LockableFrog sut = new LockableFrog("1");
		sut.lock();
		assertTrue(sut.isLocked());
		sut.unlock("0");
		assertTrue(sut.isLocked());
		sut.unlock("0");
		assertTrue(sut.isLocked());
		sut.unlock("1");
		assertFalse(sut.isLocked());
		assertEquals("", getStrippedConsole());
	}


	@Test
	void unlockThirdTimeTwiceTest()
	{
		LockableFrog sut = new LockableFrog("1");
		sut.lock();
		assertTrue(sut.isLocked());
		sut.unlock("0");
		assertTrue(sut.isLocked());
		sut.unlock("0");
		assertTrue(sut.isLocked());
		sut.unlock("1");
		assertFalse(sut.isLocked());
		assertEquals("", getStrippedConsole());
		sut.lock();
		assertTrue(sut.isLocked());
		sut.unlock("0");
		assertTrue(sut.isLocked());
		sut.unlock("0");
		assertTrue(sut.isLocked());
		sut.unlock("1");
		assertFalse(sut.isLocked());
		assertEquals("", getStrippedConsole());

	}


	@Test
	void unlockThirdTimeTwiceFailTest()
	{
		LockableFrog sut = new LockableFrog("1");
		sut.lock();
		assertTrue(sut.isLocked());
		sut.unlock("0");
		assertTrue(sut.isLocked());
		sut.unlock("0");
		assertTrue(sut.isLocked());
		sut.unlock("1");
		assertFalse(sut.isLocked());
		assertEquals("", getStrippedConsole());
		sut.lock();
		assertTrue(sut.isLocked());
		sut.unlock("0");
		assertTrue(sut.isLocked());
		sut.unlock("0");
		assertTrue(sut.isLocked());
		sut.unlock("0");
		assertTrue(sut.isLocked());
		sut.unlock("1");
		assertTrue(sut.isLocked());
		assertEquals("Attempts exhausted", getStrippedConsole());
	}

}