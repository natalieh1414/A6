public class Customer extends Person {
	
	//variables
    private int customerNumber;
    private boolean mailingList;

    // Constructors
    public Customer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList) {
        super(name, address, phoneNumber);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }
    
    //Accessor methods
    public int getCustomerNumber() {
        return customerNumber;
    }
    
    public boolean isOnMailingList() {
        return mailingList;
    }
    
    //Mutator methods/ setters
    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }
    
    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }
}