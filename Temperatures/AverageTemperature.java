import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of temperatures: ");
        int numOfTemperatures = scanner.nextInt();

        // Array to store temperatures
        double[] temperatures = new double[numOfTemperatures];

        // Input temperatures from the user
        System.out.println("Enter the temperatures:");
        for (int i = 0; i < numOfTemperatures; i++) {
            temperatures[i] = scanner.nextDouble();
        }

        // Calculate average temperature
        double sum = 0;
        for (double temperature : temperatures) {
            sum += temperature;
        }
        double averageTemperature = sum / numOfTemperatures;
        System.out.println("Average temperature: " + averageTemperature);

        // Count temperatures above average
        int aboveAverageCount = 0;
        for (double temperature : temperatures) {
            if (temperature > averageTemperature) {
                aboveAverageCount++;
            }
        }
        System.out.println("Number of temperatures above average: " + aboveAverageCount);

        scanner.close();
    }
}
