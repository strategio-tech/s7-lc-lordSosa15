package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * Calculates the remaining loan amount after 3 months.
     * @param amount The initial loan amount
     * @return The remaining loan amount after 3 months.
     */
    static int getRemainingAmountIn3Months(int amount) {
        int remainingAmount = amount;
        for(int i = 0; i < 3; i++){
            int monthlyPayment = (int)(remainingAmount * 0.1);
            remainingAmount -= monthlyPayment;
        }
        return remainingAmount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
