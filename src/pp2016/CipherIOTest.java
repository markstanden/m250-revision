package pp2016;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CipherIOTest extends ConsoleTest
{

	@Test
	void rot13_encode() throws IOException
	{
		String output = CipherIO.rot13("src/pp2016/rot13_plaintext.txt");
		assertEquals(1049, output.length());
		assertEquals(Files.readString(Path.of("src/pp2016/rot13_plaintext.txt"))
		                  .toUpperCase(), CipherIO.encodeLine(output));
	}


	@ParameterizedTest
	@ValueSource(strings = {"test test test", "TEST\nTEST\nTEST\n", "Test Test Test", "Perhaps a longer string, with punctuation, might throw up a few issues?"})
	void encodeLine_Base(String plainText)
	{
		String output = CipherIO.encodeLine(plainText);
		assertNotEquals(plainText, output);
		assertEquals(plainText.length(), output.length());
		assertEquals(plainText.toUpperCase(), CipherIO.encodeLine(output));
	}


	@Test
	void encodeLine_KnownOutput()
	{
		String plainText = "Test Test Test";
		String output = CipherIO.encodeLine(plainText);
		assertNotEquals(plainText, output);
		assertEquals(plainText.length(), output.length());
		assertEquals("GRFG GRFG GRFG", output);
		assertEquals(plainText.toUpperCase(), CipherIO.encodeLine(output));
	}
	@Test
	void encodeLine_KnownOutputA()
	{
		String plainText = "Aaaa";
		String output = CipherIO.encodeLine(plainText);
		assertNotEquals(plainText, output);
		assertEquals(plainText.length(), output.length());
		assertEquals("NNNN", output);
		assertEquals(plainText.toUpperCase(), CipherIO.encodeLine(output));
	}
	@Test
	void encodeLine_KnownOutputZ()
	{
		String plainText = "Zzzz";
		String output = CipherIO.encodeLine(plainText);
		assertNotEquals(plainText, output);
		assertEquals(plainText.length(), output.length());
		assertEquals("MMMM", output);
		assertEquals(plainText.toUpperCase(), CipherIO.encodeLine(output));
	}

}