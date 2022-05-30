package pp2013;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PostalAddressTest
{

	@Test
	void getDeliveryInfo()
	{
		var sut = new PostalAddress("First", "Second", "AB12 3CD");
		assertEquals("3CD", sut.getDeliveryInfo());
	}


	@Test
	void getAddress()
	{
		var sut = new PostalAddress("First", "Second", "AB12 3CD");
		assertEquals("First Second AB12 3CD", sut.getAddress("AB12 3CD"));
	}
}