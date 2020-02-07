package redBox;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 * @author John Enkler
 * 
 * A program designed to emulate a REDBOX. The user must request to return or rent,
 * then provide a slot number. If the user is renting from an item that has quantity 0, "Out of Stock"
 * is displayed. If the User is returning, the amount of days will be requested and a fee will be charged,
 * cost dependent on the item and amount of days out. If the user requests a slot ID that is not valid,
 * "Invalid Slot ID" is displayed.
 *
 *CURRENT STATUS: COMPLETE 2/6/2019
 */

public class Redbox {

	public static void main(String[] args) {
		
		DecimalFormat usd = new DecimalFormat("$#,###.##");
		Scanner scan = new Scanner(System.in);
		
	
				RentalItem [] itemList = new RentalItem[9];
				
				//Type(Title, release year, slot quantity, console/format) is the order.

				itemList[0] = (new VideoGames("Fallout 76", 2018, 9, 5, "XBOX"));
				
				itemList[1] = (new VideoGames("Just Cause 4", 2018, 4, 6, "PS4"));
				
				itemList[2] = (new Movies("First Man", 2019, 5, 7, "BluRay"));
				
				itemList[3] = (new Movies("Goosebumps 2", 2018, 8, 8, "Standard"));
				
				itemList[4] = (new Movies("Night School", 2018, 1, 9, "Standard"));
				
				itemList[5] = (new Movies("Venom", 2018, 3, 10, "BluRay"));
				
				itemList[6] = (new Movies("Black Panther", 2018, 6, 2, "BluRay"));
				
				itemList[7] = (new VideoGames("Resident Evil 2", 2018, 7, 4, "PS4"));
				
				itemList[8] = (new VideoGames("Madden NFL 19", 2018, 2, 0, "XBOX"));

		System.out.println("Are you renting or returning?");//Checks the customers intentions.
		
		String str= scan.nextLine(); //stores customers choice.
		
		for(int i=0; i<itemList.length; i++) {
			
			System.out.println(itemList[i]);
			
		}// Used to display the options for the customer
		
		if(str.equals("Returning")||str.equals("returning")||str.contains("ret")||str.contains("Ret")) {
			
			System.out.println("Please, choose a slot");// Requests the slot of the item in question.
			
			String strSlot = scan.nextLine(); //stores customer choice.
			
			int slotChoice = Integer.parseInt(strSlot);//translates choice into an integer.
			
			if(slotChoice>9||slotChoice<0) {
			
				System.out.println("Invalid Slot ID");
				
			}//Displayed only if Slot number is not within the bounds of the item list.
			
			for(int i=0; i<itemList.length; i++) {
				if(slotChoice==itemList[i].getSlot()) {
					
					System.out.println(itemList[i]); //Displays Chosen Item
					
					System.out.println("How many days has it been out?"); //Asks for the amount of days out
					
					int intDays = scan.nextInt(); //stores number of days
					
					System.out.println("You've had it for: " + intDays);//displays for customer
					
					//Calculates Fee
					System.out.println("Your total fee is: " + usd.format(itemList[i].rentalFee(intDays)));
					
					itemList[i].itemReturn();//method to increment item on return.
					
					//Transaction complete message
					System.out.println("The item has been returned, thank you for your patronage");
					
					System.out.println(itemList[i]); //shows incremented data
				}
			}
		} //Ends Return Block
		
		
		if(str.equals("Renting")||str.equals("renting")||str.contains("ren")||str.contains("Ren")) {
			
			System.out.println("Please, choose a slot");// Requests the slot of the item in question.
			
			String strSlot = scan.nextLine(); //stores customer choice.
			
			int slotChoice = Integer.parseInt(strSlot);//translates choice into an integer.
			
			if(slotChoice>9||slotChoice<0) {
				
				System.out.println("Invalid Argument");
				
			}
			for(int i=0; i<itemList.length; i++) {
				
				if(slotChoice==itemList[i].getSlot()) {
					
					System.out.println(itemList[i]);
					
					if(itemList[i].getQuantity()<=0) {
						
						System.out.println("Out of Stock!");
						
					}
					else if(itemList[i].getQuantity()>0) {
						
						itemList[i].itemRented();//method to decrement item on rent.
						
						System.out.println("Enjoy!"); //message
						
						System.out.println(itemList[i]); //shows decremented data
					}
				}
			}
		} //Ends Rent Block
		scan.close();
	} // Ends main method
} //Ends RedBox Class
