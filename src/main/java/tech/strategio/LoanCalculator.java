package tech.strategio;

import java.util.Scanner;


public class LoanCalculator {
    /**
     * Calculates the remaining loan amount after 3 months.
     * @param amount The initial loan amount
     * @return The remaining loan amount after 3 months.
     */
    // each month remove 10 percent of the total
    // for 3 months
    // to get the 10 percent divide the number divided by 10 / then subtract that from the number
    // loop 3 times for each month
    // starts at 0 then 1 then 2 never reaches 3 (we are trying to get 3 months so that's 012 = 3
    static int getRemainingAmountIn3Months(int amount) {

        for(int i = 0; i < 3; i++){
            amount = amount - (amount  /10);
        }
        return amount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
