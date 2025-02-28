import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	//create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Getting customer info from user input
        System.out.print("Enter customer name: ");
        	String name = scanner.nextLine();
        System.out.print("Enter customer address: ");
        	String address = scanner.nextLine();
        System.out.print("Enter customer phone number: ");
        	String phoneNumber = scanner.nextLine();
        System.out.print("Enter customer number: ");
        	int customerNumber = scanner.nextInt();
        System.out.print("Is customer on mailing list? (true/false): ");
        	boolean mailingList = scanner.nextBoolean();
        System.out.print("Enter purchase amount: ");
        	double purchaseAmount = scanner.nextDouble();

        //Creating a PreferredCustomer object
        PreferredCustomer customer = new PreferredCustomer(name, address, phoneNumber, customerNumber, mailingList, purchaseAmount);

        //Accessing customer information using getters/ accesor methods
        System.out.println("\nCustomer Information:");
        System.out.println("Name: " + customer.getName());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Phone Number: " + customer.getPhoneNumber());
        System.out.println("Customer Number: " + customer.getCustomerNumber());
        System.out.println("On Mailing List: " + customer.isOnMailingList());

        //Calculating discount and returning it 
        double discountAmount = customer.calculateDiscount(purchaseAmount);
        System.out.println("\nDiscount Amount: $" + discountAmount);

       //closing Scanner
        scanner.close();
    }
}
