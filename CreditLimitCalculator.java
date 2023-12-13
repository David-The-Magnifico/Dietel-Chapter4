import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int accountNumber;

        while (true) {
            System.out.print("Enter account number or -1 to exit: ");
            accountNumber = input.nextInt();

            if (accountNumber == -1) {
                break;
            }

            System.out.print("Enter balance at the beginning of the month: ");
            int beginningBalance = input.nextInt();

            System.out.print("Enter total of all items charged this month: ");
            int totalCharges = input.nextInt();

            System.out.print("Enter total of all credits applied this month: ");
            int totalCredits = input.nextInt();

            System.out.print("Enter allowed credit limit: ");
            int creditLimit = input.nextInt();

            int newBalance = beginningBalance + totalCharges - totalCredits;
            System.out.printf("New balance: %d%n", newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            }
        }
    }
}