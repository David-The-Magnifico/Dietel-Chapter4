import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter integer #" + i + ": ");
            int number = input.nextInt();

            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("The largest number is: " + largest);

        input.close();
    }
}
