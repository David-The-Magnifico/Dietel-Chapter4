import java.util.Scanner;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int birthYear;

    public HeartRates(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public int calculateAge(int currentYear) {
        return currentYear - birthYear;
    }

    public int calculateMaxHeartRate(int currentYear) {
        return 220 - calculateAge(currentYear);
    }

    public String calculateTargetHeartRateRange(int currentYear) {
        int maxHeartRate = calculateMaxHeartRate(currentYear);
        int minTargetHeartRate = (int) (maxHeartRate * 0.5);
        int maxTargetHeartRate = (int) (maxHeartRate * 0.85);
        return minTargetHeartRate + " - " + maxTargetHeartRate;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter year of birth: ");
        int birthYear = input.nextInt();

        int currentYear = 2023;

        HeartRates person = new HeartRates(firstName, lastName, birthYear);

        System.out.println("Name: " + person.firstName + " " + person.lastName);
        System.out.println("Age: " + person.calculateAge(currentYear) + " years");
        System.out.println("Max Heart Rate: " + person.calculateMaxHeartRate(currentYear) + " bpm");
        System.out.println("Target Heart Rate Range: " + person.calculateTargetHeartRateRange(currentYear) + " bpm");
    }
}
