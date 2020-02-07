package redBox;

/**
 * 
 * @author John Enkler
 * This subclass is used to define the contents of VIDEOGAME inside of the RedBox Class
 * 
 * Date: 2/6/2019
 * STATUS: Complete
 */

public class VideoGames extends RentalItem {
	
	public String console;
	
	/**
	 * Constructor Method for VideoGame
	 * @param title
	 * @param releaseYear
	 * @param slot
	 * @param quantity
	 */
	public VideoGames(String title, int releaseYear, int slot, int quantity, String console) {
		
		super(title, releaseYear, slot, quantity);
		
		this.console = console;
		
	}
	
	//SETTERS AND GETTERS: START	

	/**
	 * Get method for console type.
	 * @return the console
	 */
	public String getConsole() {
		return console;
	}

	/**
	 * Set method for console type. Accepted Chars = 'X' and 'P'
	 * @param console the console to set
	 */
	public void setConsole(String console) {
		if(this.console.charAt(0) == 'X') {
			this.console = console;
		}
		else if(this.console.charAt(0) == 'P') {
			this.console = console;
		}
		else
			System.out.println("Invalid ID");
	}
	
	//SETTERS AND GETTERS: END
	
	/**
	 * The overridden method for rentalFee.
	 * This method accepts an integer days, and multiplies them by 3, returning the total rental fee.
	 */
	@Override
	public double rentalFee(int days) {
		int total;
		total = days*3;
		return total;
	}//END  rentalFee

	/**
	 * toString Method for VideoGame class
	 */
	@Override
	public String toString() {
		return "Video Game console: " + console + ", Title: " + getTitle() 
		+ ", Release Year: " + getReleaseYear() + ", Slot Number: " + getSlot() 
		+ ", Quantity on Hand: " + getQuantity();
	}

	/**
	 * Equals Method for VideoGame Class
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		VideoGames other = (VideoGames) obj;
		if (console == null) {
			if (other.console != null) {
				return false;
			}
		} else if (!console.equals(other.console)) {
			return false;
		}
		return true;
	}
		
}
