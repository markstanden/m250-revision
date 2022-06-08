package pp2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class CipherIO
{
	public static String rot13(String filePath)
	{
		Path path = Path.of(filePath);
		try(BufferedReader reader = Files.newBufferedReader(path)) {
			return reader.lines()
			             .sequential()
			             .map(CipherIO::encodeLine)
			             .collect(Collectors.joining("\n"));
		}
		catch(IOException io) {
			System.out.println("File Not Found");
			return null;
		}
	}


	public static String encodeLine(String plaintext)
	{
		return plaintext.toUpperCase()
		                .chars()
		                .map(CipherIO::encodeChar)
		                .mapToObj(Character::toString)
		                .collect(Collectors.joining());
	}


	private static int encodeChar(int inputChar)
	{
		return CipherIO.rotate((char) inputChar, 13, 'A', 'Z');
	}


	public static char rotate(char inputChar, int rotationAmount, char lowerBoundIncl, char upperBoundIncl)
	{
		if(inputChar < lowerBoundIncl || inputChar > upperBoundIncl) {
			return inputChar;
		}

		/* The size of the range of valid characters.
		For Rot13 this would be 26 letter alphabet */
		int range = upperBoundIncl - lowerBoundIncl + 1;

		int rotated = inputChar + rotationAmount;

		while(rotated < lowerBoundIncl) {
			rotated += range;
		}

		while(rotated > upperBoundIncl) {
			rotated -= range;
		}

		return (char) rotated;
	}
}