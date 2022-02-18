import java.util.Scanner;
import java.lang.Math;
public class Program2 {
    public static void main(String[]args){
        System.out.println("Weekly Loan Calculator\n");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of loan: ");
        while (!input.hasNextDouble()) {
            input.next();
            System.out.print("Enter the amount of loan as a number: ");
        }
        double loanAmount = input.nextDouble();

        System.out.print("Enter the interest rate(%): ");
        while (!input.hasNextDouble()){
            input.next();
            System.out.print("Enter the interest rate as a number: ");
        }
        double interestRate = input.nextDouble();

        System.out.print("Enter the amount of years: ");
        while (!input.hasNextInt()) {
            input.next();
            System.out.print("Enter the amount of years as a number: ");
        }
        int yearAmount = input.nextInt();
        //Calculates weekly payment by using the Math class
        double interestCompound = interestRate / 5200;
        double weeklyPayment = (interestCompound / (1-(Math.pow((1+interestCompound),(-52*yearAmount)))));
        weeklyPayment = weeklyPayment * loanAmount;
        System.out.printf("\nYour weekly payment will be: $%.2f", weeklyPayment);
    }
}
