import java.util.Scanner;
public class Exercise2 {
	 public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your first number:");
		int i = scan.nextInt();
		System.out.println("What is your second number:");
		int x = scan.nextInt();
		System.out.println("This is your added total: " + (i+x));
		
	 }
}
