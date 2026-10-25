import java.util.Scanner;

public class IT26102687Lab6Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        double square = Math.pow(number, 2); 
        double squareRoot = Math.sqrt(number);

        System.out.println("The square of " + number + " is : " + square);
        System.out.println("The square root of " + number + " is : " + squareRoot);

    }
}