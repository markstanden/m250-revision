package pp2018;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoomCodeTest extends ConsoleTest
{

	@Test
	void getCode()
	{
		RoomCode sut = new RoomCode();
		sut.setCode("A000");
		assertEquals("A000", sut.getCode());
	}


	@Test
	void getBuilding()
	{
		RoomCode sut = new RoomCode();
		sut.setCode("A000");
		assertEquals('A', sut.getBuilding());
	}


	@Test
	void getFloor()
	{
		RoomCode sut = new RoomCode();
		sut.setCode("A000");
		assertEquals('0', sut.getFloor());
	}


	@Test
	void getRoom()
	{
		RoomCode sut = new RoomCode();
		sut.setCode("A000");
		assertEquals("00", sut.getRoom());
	}


	@Test
	void testToString()
	{
		RoomCode sut = new RoomCode();
		sut.setCode("A000");
		assertEquals("Building A Floor 0 Room 00", sut.toString());
	}


	@ParameterizedTest
	@ValueSource(strings = {"A000", "J000", "A900", "A090", "A00C", "J99C"})
	void setCode_Valid(String code)
	{
		RoomCode sut = new RoomCode();
		sut.setCode(code);
		assertEquals(code, sut.getCode());
	}


	@ParameterizedTest
	@ValueSource(strings = {"0000", "9000", "K000", "a000", "j000", "Z000"})
	void setCode_Invalid_Building(String code)
	{
		RoomCode sut = new RoomCode();
		sut.setCode(code);
		assertEquals("", sut.getCode());
	}


	@ParameterizedTest
	@ValueSource(strings = {"Aa00", "Az00", "AA00", "AC00", "AJ00", "AZ00"})
	void setCode_Invalid_Floor(String code)
	{
		RoomCode sut = new RoomCode();
		sut.setCode(code);
		assertEquals("", sut.getCode());
	}


	@ParameterizedTest
	@ValueSource(strings = {"A0a0", "A0A0", "A0c0", "A0C0", "A0j0", "A0J0", "A0z0", "A0Z0"})
	void setCode_Invalid_Room1(String code)
	{
		RoomCode sut = new RoomCode();
		sut.setCode(code);
		assertEquals("", sut.getCode());
	}


	@ParameterizedTest
	@ValueSource(strings = {"A00a", "A00c", "A00D", "A00j", "A00J", "A00z", "A00Z"})
	void setCode_Invalid_Room2(String code)
	{
		RoomCode sut = new RoomCode();
		sut.setCode(code);
		assertEquals("", sut.getCode());
	}


	@ParameterizedTest
	@ValueSource(strings = {"A", "0", "A0", "A00", "A0000"})
	void setCode_Invalid_Length(String code)
	{
		RoomCode sut = new RoomCode();
		sut.setCode(code);
		assertEquals("", sut.getCode());
	}


	@Test
	void isEqualCode()
	{
	}
}