import java.util.Arrays;

public class Array1a {
    public static int findMaxElement(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        for (int element : arr) {
            if (element > maxValue) {
                maxValue = element;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] myArray = {5, 3, 15, 234, 114, 1540};
        int largest = findMaxElement(myArray);
        System.out.println("The maximum value is " + largest);
    }
}



