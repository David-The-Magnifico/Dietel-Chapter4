import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] citizens = {"John", "Mary", "Bob"};
        double[] earnings = new double[3];
        double[] taxes = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter " + citizens[i] + "'s earnings for the year: $");
            earnings[i] = input.nextDouble();

            if (earnings[i] <= 30000) {
                taxes[i] = 0.15 * earnings[i];
            } else {
                taxes[i] = 0.15 * 30000 + 0.20 * (earnings[i] - 30000);
            }

            System.out.println(citizens[i] + "'s total tax is: $" + taxes[i]);
        }

        input.close();
    }
}
