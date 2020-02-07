package redBox;
/**
 * 
 * @author John Enkler
 * 
 * 2/06/2019
 * 
 * The RentalItem class is an abstract class that holds general data about an item to define a RentalItem 
 * inside of a RedBox machine.
 * 
 * STATUS: Complete
 */

public abstract class RentalItem {
	private String title;
	private int releaseYear;
	private int slot;
	private int quantity;
	
	/**
	 * Constructor Method
	 * @param title
	 * @param releaseYear
	 * @param slot
	 * @param quantity
	 */
	public RentalItem(String title, int releaseYear, int slot, int quantity) {
		super();
		this.title = title;
		this.releaseYear = releaseYear;
		this.slot = slot;
		this.quantity = quantity;
	}
	
	//SETTERS AND GETTERS START

	/**
	 * gets Title of Rental Item
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * sets the title of a Rental Item
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the release year of a Rental Item
	 * 
	 * @return the releaseYear
	 */
	public int getReleaseYear() {
		return releaseYear;
	}

	/**
	 * Sets the release Year for  a Rental Item.
	 * @param releaseYear the releaseYear to set
	 */
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	/**
	 * Gets the slot ID number for a Rental Item
	 * @return the slot
	 */
	public int getSlot() {
		return slot;
	}

	/**
	 * sets the slot ID number for a Rental Item
	 * @param slot the slot to set
	 */
	public void setSlot(int slot) {
		this.slot = slot;
	}

	/**
	 * Gets the quantity for a Rental Item
	 * 
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Sets the quantity for the Rental Item
	 * 
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//SETTERS AND GETTERS END
	
	/**
	 * Abstract Method rentalFee : MUST BE OVERRIDDEN
	 * @param days
	 * @return
	 */
	public abstract double rentalFee(int days);
	/**
	 * a void method for itemReturn, used to increment quantity of a rental item when an item is returned.
	 */
	public void itemReturn() {
		quantity += 1; // takes input and adds an integer to quantity
		
	}
	/**
	 * a void method for itemRented, used to decrement quantity of a rental item when an item is rented.
	 */
	public void itemRented() {
		quantity -= 1; // takes input and subtracts an integer from quantity
		// returns quantity
	}
}
