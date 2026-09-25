import java.util.Scanner;
import java.util.InputMismatchException;

public class _15exception {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        try {
            int num = sc.nextInt();

            int result = 10 / num;
            System.out.println("Result: " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
            System.out.println("Cannot divide by zero");
        }

        catch (InputMismatchException e) {
            System.out.println("InputMismatchException: " + e);
            System.out.println("Please enter a valid integer");
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
            System.out.println("An unexpected error occurred");
        }

        finally {
            System.out.println("This block is always executed");
            sc.close();
        }
    }
}