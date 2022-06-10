package pp2018;

public class RoomCode
{
	private String code;


	public RoomCode()
	{
		code = "";
	}


	/**
	 * @param roomCode
	 * 		Four digit room code
	 *
	 * @return True if code is valid
	 */
	private static boolean isValidCode(String roomCode)
	{
		// Return early if the basic checks fail
		if(roomCode == null || roomCode.length() != 4) {
			return false;
		}

		// if the building letter is outside of the range, return false
		if(! inCharRange(roomCode.charAt(0), 'A', 'J')) {
			return false;
		}

		// if the floor number is outside of the range return false
		if(! inCharRange(roomCode.charAt(1), '0', '9')) {
			return false;
		}

		// if the first room number is outside of the range return false
		if(! inCharRange(roomCode.charAt(2), '0', '9')) {
			return false;
		}

		// if the second room number is outside of the both ranges return false
		if(! inCharRange(roomCode.charAt(3), '0', '9') && ! inCharRange(roomCode.charAt(3), 'A', 'C')) {
			return false;
		}
		return true;
	}


	/**
	 * Tests whether the provided char is within the provided range (inclusive)
	 *
	 * @param testChar
	 * 		The char to check falls within the range
	 * @param startCharIncl
	 * 		The starting char of the range
	 * @param endCharIncl
	 * 		The end char of the range
	 *
	 * @return boolean True if the char is in the provided range (inclusive)
	 */
	private static boolean inCharRange(char testChar, char startCharIncl, char endCharIncl)
	{
		return testChar >= startCharIncl && testChar <= endCharIncl;
	}


	public String getCode()
	{
		return code;
	}


	/**
	 * The method determines if the argument represents a valid code. If so, the
	 * receiver’s code variable is set to the argument, otherwise no change is
	 * made.
	 *
	 * @param roomCode
	 * 		the new code.
	 */
	public void setCode(String roomCode)
	{
		if(isValidCode(roomCode)) {
			code = roomCode;
		}
	}


	/**
	 * a capital letter in the range A-J, standing for the building letter (there are no
	 * buildings with names in the range K-Z)
	 *
	 * @return char between A-J
	 */
	public char getBuilding()
	{
		return code.charAt(0);
	}


	/**
	 * digit, standing for the floor number
	 *
	 * @return char representing a floor number
	 */
	public char getFloor()
	{
		return code.charAt(1);
	}


	/**
	 * Two characters, identifying the room, the first of which is a digit and the second
	 * of which is either a digit or a capital letter in the range A-C.
	 */
	public String getRoom()
	{
		return code.substring(2);
	}


	@Override
	public String toString()
	{
		return String.format("Building %c Floor %c Room %s", getBuilding(), getFloor(), getRoom());
	}


	public boolean isEqualCode(RoomCode r)
	{
		if(code == null && r.code == null) {
			return true;
		}

		if(code == null || r.code == null) {
			return false;
		}

		return code.equals(r.code);
	}


}