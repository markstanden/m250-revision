package ch2;

/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 2016.02.29
 */
public class TicketMachine
{
	// The price of a ticket from this machine.
	private int price;
	// The amount of money entered by a customer so far.
	private int balance;
	// The total amount of money collected by this machine.
	private int total;


	/**
	 * Create a machine that issues tickets of the given price.
	 * Note that the price must be greater than zero, and there
	 * are no checks to ensure this.
	 */
	public TicketMachine(int cost)
	{
		price = cost;
		balance = 0;
		total = 0;
	}


	/**
	 * Ex 2.26 Add code for a standard getter method for the total field
	 * below this comment
	 */
	public int getTotal()
	{
		return total;
	}


	/**
	 * Ex 2.35 Reduce the price by amount
	 */
	public void discount(int amount)
	{
		//add your code to reduce the price by amount
		price -= amount;
	}


	/**
	 * Ex 2.37 Add a method prompt to show the user a printed message
	 * "Please insert the correct amount of money."
	 */
	public void prompt()
	{
		System.out.println("Please insert the correct amount of money.");
	}


	/**
	 * Ex 2.41 Add the method showPrice that prints the current price of a ticket.
	 * "The price of a ticket is (price) cents."
	 */
	public void showPrice()
	{
		String output = String.format("The price of a ticket is %s cents.", price);
		System.out.println(output);
	}


	/**
	 * Ex 2.45 Add the method empty that sets the total field to zero.
	 */
	public void empty()
	{
		total = 0;
	}


	/**
	 * Return the price of a ticket.
	 */
	public int getPrice()
	{
		return price;
	}


	/**
	 * Ex 2.32 Set the price
	 */
	public void setPrice(int aPrice)
	{
		//add your code here to set the price
		price = aPrice;
	}


	/**
	 * Return the amount of money already inserted for the
	 * next ticket.
	 */
	public int getBalance()
	{
		return balance;
	}


	/**
	 * Receive an amount of money from a customer.
	 */
	public void insertMoney(int amount)
	{
		balance = balance + amount;
	}


	/**
	 * Print a ticket.
	 * Update the total collected and
	 * reduce the balance to zero.
	 */
	public void printTicket()
	{
		// Simulate the printing of a ticket.
		System.out.println("##################");
		System.out.println("# The BlueJ Line");
		System.out.println("# Ticket");
		System.out.println("# " + price + " cents.");
		System.out.println("##################");
		System.out.println();

		// Update the total collected with the balance.
		total = total + balance;
		// Clear the balance.
		balance = 0;
	}
}