package pp2019;

import java.util.ArrayList;
import java.util.List;

public class CaravanSite
{
	private String siteName;
	private int maxVans;


	/** Q3-a-i */
	private List<Booking> bookings;


	public CaravanSite(String aSiteName, int vanCapacity)
	{
		siteName = aSiteName;
		maxVans = vanCapacity;
		bookings = new ArrayList<>();
	}


	/**
	 * Q3-a-iii.
	 *
	 * @param newBooking
	 * 		The new booking to add
	 *
	 * @return The new number of available booking slots.
	 */
	public int addBooking(Booking newBooking)
	{
		bookings.add(newBooking);
		return maxVans - bookings.size();
	}


	public void orderBookings()
	{
		bookings.sort(null);
	}



	public List<Booking> getBookings()
	{
		return new ArrayList<>(bookings);
	}
}