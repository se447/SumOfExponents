//Create a program that calculates the sum of 2^0+2^1+2^2+...+2^n, where n is a number entered by the user.
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int exponent = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        int number = 0;
        while (number <= exponent) {
            sum += (int)Math.pow(2, number);
            number++;
        }
        
        System.out.println("The result is " + sum);
    }
}
