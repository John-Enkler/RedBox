package redBox;
/**
 * 
 * @author John Enkler
 * 
 * This subclass is used to define the contents of MOVIES inside of the RedBox Class
 *
 *STATUS: Complete
 */

public class Movies extends RentalItem {
	
	private String format;

	/**
	 * Constructor Method for Movie
	 * @param title
	 * @param releaseYear
	 * @param slot
	 * @param quantity
	 */
	public Movies(String title, int releaseYear, int slot, int quantity, String format) {
		super(title, releaseYear, slot, quantity);
		this.format = format;
		// TODO Auto-generated constructor stub
	}
	//SETTERS AND GETTERS: START

	/**
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * @param format the format to set
	 */
	public void setFormat(String format) {
		this.format = format;
	}
	
	//SETTERS AND GETTERS: END
	

	@Override
	public double rentalFee(int days) {
		// TODO Auto-generated method stub
		double total= 0;
		if(this.getFormat() == "BluRay") {
			total = days*2.00;
		}
		else if(this.getFormat() == "Standard") {
			total = days*1.75;
		}
		return total;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Movie, format: " + format + " Title: " + getTitle() + ", Release Year: " + getReleaseYear() 
		+ ", Slot Number: " + getSlot() + ", Quantity On Hand: " + getQuantity();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movies other = (Movies) obj;
		if (format == null) {
			if (other.format != null)
				return false;
		} else if (!format.equals(other.format))
			return false;
		return true;
	}
	

}
