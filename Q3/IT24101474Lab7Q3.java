import java.util.Scanner;

public class IT24101474Lab7Q3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        final int NUMBER_OF_CUSTOMERS = 5;
        double totalBill, discount, amountToPay;

        for (int i = 1; i <= NUMBER_OF_CUSTOMERS; i++) {
	    System.out.println("Customer " + i + " ");

            System.out.print("Enter the total bill amount for customer " + i + ": ");

            totalBill = s.nextDouble();
	     s.nextLine(); 

            System.out.print("Enter the mode of payment (C for Cash, O for Other): ");
            char paymentMode = s.nextLine().charAt(0);
		amountToPay = totalBill; 

            if (paymentMode== 'C' || paymentMode== 'c') {
                discount = totalBill * 0.05;  

                amountToPay = totalBill - discount;
		System.out.println("Total Bill: " + totalBill);
		System.out.println("Discount: " + discount);
		System.out.println("Amount to be Paid: " + amountToPay);


            } else if (paymentMode == 'O' || paymentMode == 'o') {
               System.out.println("Total Bill: " + totalBill);
		System.out.println("No Discount");
		System.out.println("Amount to be Paid: " + amountToPay);


            } else {
                System.out.println("Payment Mode is Not Valid");
            }
        }

        s.close();
    }
}
