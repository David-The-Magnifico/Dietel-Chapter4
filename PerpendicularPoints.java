import java.util.Scanner;

public class PerpendicularPoints {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the x and y coordinates of the first point: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter the x and y coordinates of the second point: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        input.close();
    
        boolean isPerpendicular = false;
       
        if (x1 == x2) {
            isPerpendicular = true;
        }
       
        if (y1 == y2) {
            isPerpendicular = true;
        }
        
        if (isPerpendicular) {
            System.out.println("The points are located on a line perpendicular to an axis.");
        } else {
            System.out.println("The points are not located on a line perpendicular to an axis.");
        }
    }
}
