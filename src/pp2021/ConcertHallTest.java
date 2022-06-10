package pp2021;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcertHallTest extends ConsoleTest
{

	@Test
	void addConcert()
	{
		var testConcert = new Concert("2022-01-01", "Strings");
		testConcert.addProgrammeItem(new Music("TestMusic1", "TestComposer1", 10));
		testConcert.addProgrammeItem(new Music("TestMusic2", "TestComposer2", 20));
		testConcert.addProgrammeItem(new Music("TestMusic3", "TestComposer3", 30));
		testConcert.addProgrammeItem(new Music("TestMusic4", "TestComposer1", 40));
		var testConcert2 = new Concert("2022-01-02", "Strings");
		testConcert.addProgrammeItem(new Music("TestMusic1", "TestComposer1", 10));
		testConcert.addProgrammeItem(new Music("TestMusic2", "TestComposer1", 20));
		testConcert.addProgrammeItem(new Music("TestMusic3", "TestComposer1", 30));
		testConcert.addProgrammeItem(new Music("TestMusic4", "TestComposer1", 40));

	}
}