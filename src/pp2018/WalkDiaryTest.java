package pp2018;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WalkDiaryTest extends ConsoleTest
{

	@Test
	void addWalk()
	{
		WalkDiary sut = new WalkDiary();
		sut.addWalk("2000-01-01", List.of("Test1", "Test2"));
		sut.addWalk("2000-01-02", List.of("Test3", "Test4"));
		assertEquals(List.of("Test1", "Test2"),
		             sut.getWalks()
		                .get("2000-01-01"));
		assertEquals(List.of("Test3", "Test4"),
		             sut.getWalks()
		                .get("2000-01-02"));
	}
}