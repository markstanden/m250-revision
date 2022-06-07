package pp2019;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CaravanSiteTest extends ConsoleTest
{

	@Test
	void orderBookings()
	{
		CaravanSite sut = new CaravanSite("Test", 10);
		sut.addBooking(new Booking("Test4", "Testy McTestFace", 21));
		sut.addBooking(new Booking("Test2", "Testy McTest", 20));
		sut.addBooking(new Booking("Test3", "Testy Test", 20));
		sut.addBooking(new Booking("Test1", "Testing Testy", 19));
		sut.addBooking(new Booking("Test0", "Tessa McTester", 1));
		sut.orderBookings();
		assertEquals("Test0",
		             sut.getBookings()
		                .get(0)
		                .getMakeAndModel());
		assertEquals("Test1",
		             sut.getBookings()
		                .get(1)
		                .getMakeAndModel());
		assertEquals("Test2",
		             sut.getBookings()
		                .get(2)
		                .getMakeAndModel());
		assertEquals("Test3",
		             sut.getBookings()
		                .get(3)
		                .getMakeAndModel());
		assertEquals("Test4",
		             sut.getBookings()
		                .get(4)
		                .getMakeAndModel());
	}
}