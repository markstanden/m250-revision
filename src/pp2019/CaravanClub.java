package pp2019;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CaravanClub
{
	private Map<Integer, Set<Booking>> arrByTime;


	public CaravanClub()
	{
		arrByTime = new HashMap<>(24);
	}


	public void addSite(CaravanSite newSite)
	{
		for(Booking booking : newSite.getBookings()) {
			int eta = booking.getEstArrivalHour();

			Set<Booking> allBookingsThisHour = arrByTime.getOrDefault(eta, new HashSet<>());
			allBookingsThisHour.add(booking);
			arrByTime.put(eta, allBookingsThisHour);
		}
	}


	/**
	 * For testing.
	 */
	public Map<Integer, Set<Booking>> getArrByTime()
	{
		return arrByTime;
	}
}