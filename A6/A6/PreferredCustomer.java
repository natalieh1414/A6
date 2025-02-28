
public class PreferredCustomer extends Customer {
	
	//variables
    private double purchaseNumber;
    private int discount;

    //Constructors
    public PreferredCustomer(String name, String address, String phoneNumber,
    		int customerNumber, boolean mailingList, double purchaseNumber) 
    {
        super(name, address, phoneNumber, customerNumber, mailingList);
        this.purchaseNumber = purchaseNumber;
        updateDiscount();
    }
    
    //getters/ accessor methods
    public double getPurchasesAmount() {
        return purchaseNumber;
    }
    
    public int getDiscountLevel() {
        return discount;
    }
    
    //setters/ mutator method
    public void setPurchaseNumber(double purchaseNumber) {
        this.purchaseNumber = purchaseNumber;
        updateDiscount(); // New discount when purchaseNumber changes
    }

    // Method to update discount based on the purchase number
    private void updateDiscount() {
        if (purchaseNumber >= 2000) {
            discount = 10;	//10 percent
        } else if (purchaseNumber >= 1500) {
            discount = 7;	//7 percent
        } else if (purchaseNumber >= 1000) {
            discount = 6;	//6 percent
        } else if (purchaseNumber >= 500) {
            discount = 5;	//5 percent
        } else {
            discount = 0; // No discount
        }
    }

    //calculate discount for a purchase number
    public double calculateDiscount(double purchaseNumber) {
        return purchaseNumber * discount / 100.0;
    }
}

