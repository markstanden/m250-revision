package pp2019;

import java.util.Objects;

public class Booking implements Comparable<Booking>
{
	private String makeAndModel;
	private String owner;
	private int estArrivalHour; //0-23 incl


	public Booking(String makeAndModel, String owner, int estArrivalHour)
	{
		this.estArrivalHour = estArrivalHour;
		this.makeAndModel = makeAndModel;
		this.owner = owner;
	}


	public String getMakeAndModel()
	{
		return makeAndModel;
	}


	public String getOwner()
	{
		return owner;
	}


	public int getEstArrivalHour()
	{
		return estArrivalHour;
	}


	@Override
	public boolean equals(Object otherObj)
	{
		if(! (otherObj instanceof Booking)) {
			return false;
		}

		Booking otherBooking = (Booking) otherObj;
		return otherBooking.owner.equals(owner) && otherBooking.makeAndModel.equals(makeAndModel);
	}


	@Override
	public int hashCode()
	{
		return Objects.hashCode(owner.concat(makeAndModel));
	}


	/**
	 * Q3-b-i
	 *
	 * @param otherBooking
	 * 		the object to be compared.
	 */
	@Override
	public int compareTo(Booking otherBooking)
	{
		return this.estArrivalHour - otherBooking.estArrivalHour;
	}
}