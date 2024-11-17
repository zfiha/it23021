import java.util.Scanner;

public class ComputeAreaConstant {
    public static void main(String[] args) {
        final double pi = 3.14159;  
                Scanner input = new Scanner(System.in);

               System.out.println("Enter number for radius:");

                double radius = input.nextDouble();

        double area = radius * radius * pi;

        
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

                input.close();
    }
}