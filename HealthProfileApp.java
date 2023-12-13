import java.util.Scanner;

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

        System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Age: " + person.calculateAge(currentYear) + " years");
        System.out.println("BMI: " + person.calculateBMI());
        System.out.println("Max Heart Rate: " + person.calculateMaxHeartRate(currentYear) + " bpm");
        System.out.println("Target Heart Rate Range: " + person.calculateTargetHeartRateRange(currentYear) + " bpm");
    }
}