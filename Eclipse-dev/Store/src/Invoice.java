/**
 * 
 * @author Radoslav Radoev
 *
 */
public class Invoice {
	private String partNumber;
	private String partDescription;
	private int purchaseQuantity;
	private double itemPrice;
	
	public Invoice (String partNumber, String partDescription,
			int purchaseQuantity, double itemPrice) {
		
		setPartNumber(partNumber);
		setPartDescription(partDescription);
		setPurchaseQuantity(purchaseQuantity);
		setItemPrice(itemPrice);
	}
	
	/* Defining PartNumber getter*/
	public String getPartNumber() {
		return partNumber;
	}
	/* Defining PartNumber setter*/
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	
	/* Defining PartDescription getter*/
	public String getPartDescription () {
		return partDescription;
	}
	/* Defining PartDescription setter*/
	public void setPartDescription (String partDescription) {
		this.partDescription = partDescription;
	}
	
	/* Defining PurchaseQuantity getter*/
	public int getPurchaseQuantity () {
		return purchaseQuantity;
	}
	/* Defining PurchaseQuantity setter*/
	public void setPurchaseQuantity (int purchaseQuantity) {
		this.purchaseQuantity = purchaseQuantity;
	}
	
	/* Defining PurchaseQuantity getter*/
	public double getItemPrice () {
		return itemPrice;
	}
	/* Defining PurchaseQuantity setter*/
	public void setItemPrice (double itemPrice) {
		this.itemPrice = itemPrice;
	}

	
	/* Invoice method*/
	public double getInvoiceAmount(int purchaseQuantity, double itemPrice) {
		double invoice = 0.0;
		if (Math.max(purchaseQuantity, 0) <= 0) {
			return invoice;
		} 
		else if (Math.max(itemPrice, 0) <= 0) {
			return invoice;
		}
		else {
			invoice = purchaseQuantity * itemPrice;
			return invoice;
		}
	}
	
	
	/* Display invoice method*/
	public void DisplayInvoice (Invoice newInvoice) {
		System.out.println("The part number is: " + newInvoice.getPartNumber() + ".\n" + 
				"The part is: " + newInvoice.getPartDescription() + ".\n" + 
				"The purchased quantity is: " + newInvoice.getPurchaseQuantity() + ".\n" +
				"The invoice amount is: " + newInvoice.getInvoiceAmount(newInvoice.getPurchaseQuantity(), newInvoice.getItemPrice()) + ".");
	}
	
}
