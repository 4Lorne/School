import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hipster's Local Vinyl Records - Customer Order Details \n");

        System.out.print("Enter the customer's name: ");
        String custName = input.nextLine();
        //Loops until a double is entered.
        System.out.print("Enter the distance in kilometers for delivery: ");
        while(!input.hasNextDouble()){
            input.next();
            System.out.print("Enter the distance in kilometers for delivery as a number: ");
        }
        double kmDriven = input.nextDouble();

        System.out.print("Enter the cost of the records purchased: ");
        while(!input.hasNextDouble()){
            input.next();
            System.out.print("Enter the cost of the records purchased as a number: ");
        }
        double vinylCost = input.nextDouble();

        double deliveryCost = 15 * kmDriven;
        double vinylTax = 0.14 * vinylCost;
        double purchaseTotal = vinylCost + vinylTax;
        double finalFee = purchaseTotal + deliveryCost;
        //Prints final tally, controls the decimal for 2 places.
        System.out.print("\nPurchase summary for "+custName);
        System.out.printf("\nDelivery cost: $%.2f ",deliveryCost);
        System.out.printf("\nPurchase cost: $%.2f",purchaseTotal);
        System.out.printf("\nTotal cost: $%.2f",finalFee);
    }
}
