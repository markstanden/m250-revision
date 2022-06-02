package specimen;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q6Test extends ConsoleTest
{
	Q6 q = new Q6();


	@Test
	public void nickTest()
	{
		Q6.Child sut = q.new Child("Test", "Subject");
		sut.setFirstName("Icena");
		sut.setLastName("Hoffman");

		assertEquals("Iceman", sut.getNickname());
	}


	@Test
	public void shirtColourTest_notPlaying()
	{
		Q6.Child sut = q.new Child("Test", "Subject");
		sut.setPlaying(false);

		sut.setShirtColour(Color.BLACK);

		assertEquals(Color.BLACK, sut.getShirtColour());
		assertEquals("", getStrippedConsole());
	}


	@Test
	public void shirtColourTest_playing()
	{
		Q6.Child sut = q.new Child("Test", "Subject");
		sut.setPlaying(false);
		sut.setShirtColour(Color.BLUE);

		sut.setPlaying(true);
		sut.setShirtColour(Color.BLACK);

		assertEquals(Color.BLUE, sut.getShirtColour());
		assertEquals("I'm wearing play clothes already", getStrippedConsole());
	}


	@Test
	public void shirtColourTest_playingInWhite()
	{
		Q6.Child sut = q.new Child("Test", "Subject");
		sut.setPlaying(false);
		sut.setShirtColour(Color.WHITE);

		sut.setPlaying(true);
		sut.setShirtColour(Color.BLACK);

		assertEquals(Color.BLACK, sut.getShirtColour());
		assertEquals("I'm changing now", getStrippedConsole());
	}


	@Test
	public void goHomeTest_noFriends()
	{
		Q6.Child sut = q.new Child("Test", "Subject");

		sut.setNumFriends(0);
		sut.goHome();

		assertEquals("I'm going home", getStrippedConsole());
	}

	@Test
	public void goHomeTest_OneFriend()
	{
		Q6.Child sut = q.new Child("Test", "Subject");

		sut.setNumFriends(1);
		sut.goHome();

		assertEquals("Bye", getStrippedConsole());
	}

	@Test
	public void goHomeTest_TwoFriends()
	{
		Q6.Child sut = q.new Child("Test", "Subject");

		sut.setNumFriends(2);
		sut.goHome();

		assertEquals("Bye\nBye", getStrippedConsole());
	}
}