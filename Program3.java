import java.lang.Math;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Imperial to Metric Conversion\n");

        System.out.print("Enter the number of tons: ");
        while (!input.hasNextDouble()) {
            input.next();
            System.out.print("Enter the number of tons: ");
        }
        double tons = input.nextDouble();
        System.out.print("Enter the number of stone: ");
        while (!input.hasNextDouble()) {
            input.next();
            System.out.print("Enter the number of stone: ");
        }
        double stone = input.nextDouble();
        System.out.print("Enter the number of pounds: ");
        while (!input.hasNextDouble()) {
            input.next();
            System.out.print("Enter the number of pounds: ");
        }
        double pounds = input.nextDouble();
        System.out.print("Enter the number of ounces: ");
        while (!input.hasNextDouble()) {
            input.next();
            System.out.print("Enter the number of ounces: ");
        }
        double ounces = input.nextDouble();

        double totalOunces = (35840 * tons) + (224 * stone) + (16 * pounds) + ounces;
        double totalKilos = totalOunces / 35.274;

        // Find how many tons, subtract the remainder to find leftover kilos, repeat for
        // grams.
        // Convert leftcover kilos into grams, then convert tons and kilos to ints using
        // Math.floor
        // Keep grams as a double, use printf to control the decimal place.
        double metricTons = totalKilos / 1000;
        double leftoverKilos = (metricTons - Math.floor(metricTons)) * 1000;
        double leftoverGrams = (leftoverKilos - Math.floor(leftoverKilos)) * 1000;

        int metricTonsRounded = (int) Math.floor(totalKilos / 1000);

        leftoverKilos = Math.floor(leftoverKilos);
        int metricKilosRounded = (int) Math.round(leftoverKilos);

        System.out.print("\nThe metric weight is " + metricTonsRounded + " tons, " + metricKilosRounded + " kilos, and ");
        System.out.printf("%.1f", leftoverGrams);
        System.out.print(" grams.");
    }
}