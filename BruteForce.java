
//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/LinkedHashSet.html
import java.util.LinkedHashSet;

public class BruteForce {
    public static void main(String[] args) {
        int result = 0;
        int resultFinal = 0;
        int realAnswer = 0;
        int realX = 0;
        int realDigits = 0;
        // Using a linked hash set, because
        LinkedHashSet<Integer> uniqueCheck = new LinkedHashSet<Integer>();
        // Array with all the repeating numbers
        int[] sixDigits = { 111111, 222222, 333333, 444444, 555555, 666666, 777777, 888888, 999999 };
        // Loop to iterate through both the sixDigits array and the numbers 2-9
        for (int i = 0; i < 9; i++) {
            for (int x = 2; x <= 9; x++) {
                // Resetting result value and uniqueCheck if it doesn't meet the criteria
                result = 0;
                result = sixDigits[i] / x;
                uniqueCheck.clear();
                resultFinal = result;
                // Using mod 10 to add the last digit of result to the linked hashset
                // Dividing result by result to remove the digit we just added to the hashset
                // https://www.java67.com/2014/11/modulo-or-remainder-operator-in-java.html
                while (result > 0) {
                    uniqueCheck.add(result % 10);
                    result = result / 10;
                    // Hashsets can only have unique items within them, so if 5 digits make it
                    // through
                    // That means it will be the answer.
                    // Using resultFinal to hold the value of result before the while loop
                    if (uniqueCheck.size() == 5 && resultFinal * x == sixDigits[i]) {
                        System.out.println("Found an answer: " + resultFinal + " times " + x + " equals " + sixDigits[i]);
                        if (sixDigits[i] % 10 == resultFinal % 10) {
                            realAnswer = resultFinal;
                            realX = x;
                            realDigits = sixDigits[i];
                        }
                        uniqueCheck.clear();
                    }
                }
            }
        }
        System.out.println("\n\nReal answer: " + realAnswer + " times " + realX + " equals " + realDigits);
    }
}