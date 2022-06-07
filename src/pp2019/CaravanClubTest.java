package pp2019;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class CaravanClubTest extends ConsoleTest
{

	@Test
	void addSite()
	{
		CaravanSite site1 = new CaravanSite("TestPlace1", 10);
		site1.addBooking(new Booking("Test4a", "Testy McTestFace", 21));
		site1.addBooking(new Booking("Test2a", "Testy McTest", 20));
		site1.addBooking(new Booking("Test3a", "Testy Test", 20));
		site1.addBooking(new Booking("Test1a", "Testing Testy", 19));
		site1.addBooking(new Booking("Test0a", "Tessa McTester", 1));

		CaravanSite site2 = new CaravanSite("TestPlace2", 100);
		site2.addBooking(new Booking("Test4b", "Testy McTestFace", 20));
		site2.addBooking(new Booking("Test2b", "Testy McTest", 20));
		site2.addBooking(new Booking("Test3b", "Testy Test", 10));
		site2.addBooking(new Booking("Test1b", "Testing Testy", 12));
		site2.addBooking(new Booking("Test0b", "Tessa McTester", 5));
		site2.orderBookings();

		CaravanSite site3 = new CaravanSite("TestPlace3", 100);
		site3.addBooking(new Booking("Test4c", "Testy McTestFace", 10));
		site3.addBooking(new Booking("Test2c", "Testy McTest", 9));
		site3.addBooking(new Booking("Test3c", "Testy Test", 9));
		site3.addBooking(new Booking("Test1c", "Testing Testy", 2));
		site3.addBooking(new Booking("Test0c", "Tessa McTester", 6));

		CaravanClub sut = new CaravanClub();
		sut.addSite(site1);
		assertEquals(4,
		             sut.getArrByTime()
		                .size());
		sut.addSite(site2);
		assertEquals(7,
		             sut.getArrByTime()
		                .size());
		sut.addSite(site3);
		assertEquals(10,
		             sut.getArrByTime()
		                .size());
		assertNull(sut.getArrByTime()
		              .get(0));
		assertEquals(1,
		             sut.getArrByTime()
		                .get(1)
		                .size());
		assertEquals(2,
		             sut.getArrByTime()
		                .get(10)
		                .size());
		assertEquals(4,
		             sut.getArrByTime()
		                .get(20)
		                .size());
	}
}