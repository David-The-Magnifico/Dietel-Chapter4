import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        int totalMiles = 0;
        int totalGallons = 0;
        int tripCount = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter miles driven (or -1 to exit): ");
        int milesDriven = input.nextInt();

        while (milesDriven != -1) {
            System.out.print("Enter gallons used: ");
            int gallonsUsed = input.nextInt();

            double milesPerGallon = (double) milesDriven / gallonsUsed;
            System.out.printf("Miles per gallon for this trip: %.2f%n", milesPerGallon);

            totalMiles += milesDriven;
            totalGallons += gallonsUsed;
            tripCount++;

            if (tripCount > 0) {
                double combinedMilesPerGallon = (double) totalMiles / totalGallons;
                System.out.printf("Combined miles per gallon: %.2f%n", combinedMilesPerGallon);
            }

            System.out.print("Enter miles driven (or -1 to exit): ");
            milesDriven = input.nextInt();
        }
    }
}
