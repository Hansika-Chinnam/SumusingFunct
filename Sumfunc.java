import java.util.Scanner;

public class  Sumfunc{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double sum = calculateSum(num1, num2);

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        scanner.close();
    }

    // Function to calculate the sum of two numbers
    public static double calculateSum(double num1, double num2) {
        return num1 + num2;
    }
}


