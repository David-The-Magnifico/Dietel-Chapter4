import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a four-digit integer: ");
        int number = scanner.nextInt();

        int encrypted = encrypt(number);
        System.out.println("Encrypted number: " + encrypted);
    }

    static int encrypt(int num) {
        int[] digits = new int[4];
        
        for (int i = 3; i >= 0; i--) {
            digits[i] = num % 10;
            digits[i] += 7;
            digits[i] %= 10;
            num /= 10;
        }
        
        return (digits[2] * 1000) + (digits[3] * 100) + (digits[0] * 10) + digits[1];
    }
}
