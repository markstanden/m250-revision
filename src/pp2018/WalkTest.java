package pp2018;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WalkTest extends ConsoleTest
{

	@Test
	void addPlace()
	{
		Walk sut = new Walk("16/7/17", List.of("Porth", "Watergate Bay", "Mawgan", "Bedruthan Steps", "Porthcothan"));
		assertEquals(6, sut.addPlace("Test"));
	}


	@Test
	void whichPlace_First()
	{
		Walk sut = new Walk("16/7/17", List.of("Porth", "Watergate Bay", "Mawgan", "Bedruthan Steps", "Porthcothan"));
		assertEquals("Porth", sut.whichPlace(1));
	}

	@Test
	void whichPlace_Last()
	{
		Walk sut = new Walk("16/7/17", List.of("Porth", "Watergate Bay", "Mawgan", "Bedruthan Steps", "Porthcothan"));
		assertEquals("Porthcothan", sut.whichPlace(5));
	}

	@Test
	void whichPlace_Invalid_Low()
	{
		Walk sut = new Walk("16/7/17", List.of("Porth", "Watergate Bay", "Mawgan", "Bedruthan Steps", "Porthcothan"));
		assertEquals("Invalid index", sut.whichPlace(0));
	}

	@Test
	void whichPlace_Invalid_High()
	{
		Walk sut = new Walk("16/7/17", List.of("Porth", "Watergate Bay", "Mawgan", "Bedruthan Steps", "Porthcothan"));
		assertEquals("Invalid index", sut.whichPlace(6));
	}


	@Test
	void whichIndex()
	{
		Walk sut = new Walk("16/7/17", List.of("Porth", "Watergate Bay", "Mawgan", "Bedruthan Steps", "Porthcothan"));
		assertEquals(3, sut.whichIndex("Mawgan"));
	}


	@Test
	void removePlace_Invalid()
	{
		String expected = "On 16/7/17 the following places were visited:\nPorth\nWatergate Bay\nMawgan\nBedruthan Steps\nPorthcothan";
		Walk sut = new Walk("16/7/17", List.of("Porth", "Watergate Bay", "Mawgan", "Bedruthan Steps", "Porthcothan"));
		assertEquals(-1, sut.removePlace("Perth"));
		sut.printWalk();
		assertEquals(expected, getStrippedConsole());
	}

	@Test
	void removePlace1()
	{
		String expected = "On 16/7/17 the following places were visited:\nWatergate Bay\nMawgan\nBedruthan Steps\nPorthcothan";
		Walk sut = new Walk("16/7/17", List.of("Porth", "Watergate Bay", "Mawgan", "Bedruthan Steps", "Porthcothan"));
		assertEquals(4, sut.removePlace("Porth"));
		sut.printWalk();
		assertEquals(expected, getStrippedConsole());
	}


	@Test
	void removePlace5()
	{
		String expected = "On 16/7/17 the following places were visited:\nPorth\nWatergate Bay\nMawgan\nBedruthan Steps";
		Walk sut = new Walk("16/7/17", List.of("Porth", "Watergate Bay", "Mawgan", "Bedruthan Steps", "Porthcothan"));
		assertEquals(4, sut.removePlace("Porthcothan"));
		sut.printWalk();
		assertEquals(expected, getStrippedConsole());
	}


	@Test
	void removePlace3()
	{
		String expected = "On 16/7/17 the following places were visited:\nPorth\nWatergate Bay\nBedruthan Steps\nPorthcothan";
		Walk sut = new Walk("16/7/17", List.of("Porth", "Watergate Bay", "Mawgan", "Bedruthan Steps", "Porthcothan"));
		assertEquals(4, sut.removePlace("Mawgan"));
		sut.printWalk();
		assertEquals(expected, getStrippedConsole());
	}


	@Test
	void updateName_Valid()
	{
		String expected = "On 16/7/17 the following places were visited:\nTruro\nWatergate Bay\nMawgan\nBedruthan Steps\nPorthcothan";
		Walk sut = new Walk("16/7/17", List.of("Porth", "Watergate Bay", "Mawgan", "Bedruthan Steps", "Porthcothan"));
		assertTrue(sut.updateName("Porth", "Truro"));
		sut.printWalk();
		assertEquals(expected, getStrippedConsole());
	}


	@Test
	void updateName_Invalid()
	{
		String expected = "On 16/7/17 the following places were visited:\nPorth\nWatergate Bay\nMawgan\nBedruthan Steps\nPorthcothan";
		Walk sut = new Walk("16/7/17", List.of("Porth", "Watergate Bay", "Mawgan", "Bedruthan Steps", "Porthcothan"));
		assertFalse(sut.updateName("Perth", "Truro"));
		sut.printWalk();
		assertEquals(expected, getStrippedConsole());
	}


	@Test
	void printWalk()
	{
		String expected = "On 16/7/17 the following places were visited:\nPorth\nWatergate Bay\nMawgan\nBedruthan Steps\nPorthcothan";
		Walk sut = new Walk("16/7/17", List.of("Porth", "Watergate Bay", "Mawgan", "Bedruthan Steps", "Porthcothan"));
		sut.printWalk();
		assertEquals(expected, getStrippedConsole());
	}
}