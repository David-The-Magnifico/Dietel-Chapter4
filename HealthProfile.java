import java.util.Scanner;

class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int birthYear;
    private int heightInInches;
    private int weightInPounds;

    public HealthProfile(String firstName, String lastName, String gender, int birthYear, int heightInInches, int weightInPounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthYear = birthYear;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
    }

    public int calculateAge(int currentYear) {
        return currentYear - birthYear;
    }

    public double calculateBMI() {
        return (weightInPounds / (heightInInches * heightInInches)) * 703;
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
}

public class HealthProfileApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter gender: ");
        String gender = input.nextLine();

        System.out.print("Enter year of birth: ");
        int birthYear = input.nextInt();

        System.out.print("Enter height in inches: ");
        int heightInInches = input.nextInt();

        System.out.print("Enter weight in pounds: ");
        int weightInPounds = input.nextInt();

        int currentYear = 2023;

        HealthProfile person = new HealthProfile(firstName, lastName, gender, birthYear, heightInInches, weightInPounds);

        System.out.println("Name: " + person.firstName + " " + person.lastName);
        System.out.println("Age: " + person.calculateAge(currentYear) + " years");
        System.out.println("BMI: " + person.calculateBMI());
        System.out.println("Max Heart Rate: " + person.calculateMaxHeartRate(currentYear) + " bpm");
        System.out.println("Target Heart Rate Range: " + person.calculateTargetHeartRateRange(currentYear) + " bpm");
    }
}
