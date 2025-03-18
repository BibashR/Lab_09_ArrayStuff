import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        // Task 1
        int[] dataPoints = new int[100];
        // Task 2
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        // Task 3
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " | ");
        }
        // Task 4
        int sum = 0;
        for (int val : dataPoints) {
            sum += val;
        }
        double average = (double) sum / dataPoints.length;
        System.out.println("The sum of the dataPoints array is: " + sum);
        System.out.println("The average of the dataPoints array is: " + average);
        // Task 5
        int userValue = SafeInput.getRangedInt(sc, "Enter a number between 1 and 100", 1, 100);
        // Task 6
        int count = 0;
        for (int val : dataPoints) {
            if (val == userValue) {
                count++;
            }
        }
        System.out.println("The value " + userValue + " appears " + count + " times in the array.");
        // Task 7
        int position = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            System.out.println("The value " + userValue + " was found at index " + position + ".");
        } else {
            System.out.println("The value " + userValue + " was not found in the array.");
        }
        // Task 8
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int val : dataPoints) {
            if (val < min) min = val;
            if (val > max) max = val;
        }
        System.out.println("Minimum value in dataPoints: " + min);
        System.out.println("Maximum value in dataPoints: " + max);
        // Task 9
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }
    // Static method
    public static double getAverage(int values[]) {
        int sum = 0;
        for (int val : values) {
            sum += val;
        }
        return (double) sum / values.length;
    }
}