package pp2019;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ServiceDrivablePlayTest
{

	@Test
	void DrivablePlay()
	{
		Car c = new Car();
		assertTrue(c instanceof Vehicle);
		assertTrue(c instanceof Car);
		assertFalse(c instanceof SportsCar);
		assertTrue(c instanceof Drivable);

		SportsCar sc = new SportsCar();
		assertTrue(sc instanceof Vehicle);
		assertTrue(sc instanceof Car);
		assertTrue(sc instanceof SportsCar);
		assertTrue(sc instanceof Drivable);

		Service sut = new Service(sc);
		assertTrue(sut.getToService() instanceof Drivable);
	}
}