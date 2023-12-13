import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of items sold: ");
        int numberOfItems = input.nextInt();

        double totalSales = 0;

        for (int i = 1; i <= numberOfItems; i++) {
            System.out.print("Enter the value of item " + i + ": $");
            double itemValue = input.nextDouble();
            totalSales += itemValue;
        }

        double earnings = 200 + (0.09 * totalSales);
        System.out.println("The salesperson's earnings for the week is: $" + earnings);

        input.close();
    }
}
