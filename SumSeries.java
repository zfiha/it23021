import java.util.Scanner;

class SumSeries {

    public static void main(String[] args) {
        System.out.println("Enter The number: ");

        // Create a Scanner object to read user input
        Scanner myValue = new Scanner(System.in);
        
        // Read the user's input for the high value
        int highValue = myValue.nextInt();
        
        // Initialize the sum variable
        int sum = 0;
        
        // Loop through numbers from 1 to highValue and calculate the sum
        for (int i = 1; i <= highValue; i++) {
            sum += i;
        }
        
        // Output the result
        System.out.println("The Sum of the series: " + sum);
        
        // Close the scanner to prevent resource leak
        myValue.close();
    }
}