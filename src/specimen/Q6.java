package specimen;

import specimen.OU.Person;

import java.awt.*;

public class Q6
{
	public class Child extends Person
	{
		private boolean playing;


		public Child(String aFirstName, String aSecondName)
		{
			super(aFirstName, aSecondName);
			playing = true;
			setMoney(10);
		}


		public boolean isPlaying()
		{
			return playing;
		}


		public void setPlaying(boolean isPlaying)
		{
			playing = isPlaying;
		}


		public void play()
		{
			playing = true;
			setNumFriends(getNumFriends() + 1);
		}


		public void work()
		{
			playing = false;
			setNumFriends(getNumFriends() - 1);
		}


		/**
		 * The method returns the first three letters of the child's first name
		 * concatenated to the last three letters of the child's last name in lowercase
		 *
		 * @return Nickname
		 */
		public String getNickname()
		{
			String first = getFirstName();
			String last = getLastName();
			return first.substring(0, 3) + last.substring(last.length() - 3)
			                                   .toLowerCase();
		}


		public void buySnack(int snackCost)
		{
			if(snackCost <= getMoney()) {
				spendMoney(snackCost);
			}
			else {
				System.out.println("I need money");
			}
		}


		public void goHome()
		{
			if(getNumFriends() <= 0) {
				System.out.println("I'm going home");
			}
			else {
				for(int friend = 0; friend < getNumFriends(); friend++) {
					System.out.println("Bye");
				}
			}
		}


		@Override
		public void setShirtColour(Color aColour)
		{
			if(!playing) {
				super.setShirtColour(aColour);
			}
			else {
				if(getShirtColour().equals(Color.WHITE)) {
					System.out.println("I'm changing now");
					super.setShirtColour(aColour);
				}
				else {
					System.out.println("I'm wearing play clothes already");
				}
			}
		}
	}
}