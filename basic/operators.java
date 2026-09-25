public class operators {
    public static void main(String[] args) {
        // Declare two variables
        int a = 10;
        int b = 5;

        // Perform arithmetic operations
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        // Print the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Perform comparison operations
        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreaterThan = (a > b);
        boolean isLessThan = (a < b);
        boolean isGreaterThanOrEqualTo = (a >= b);
        boolean isLessThanOrEqualTo = (a <= b);

        // Print the comparison results
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Is Not Equal: " + isNotEqual);
        System.out.println("Is Greater Than: " + isGreaterThan);
        System.out.println("Is Less Than: " + isLessThan);
        System.out.println("Is Greater Than or Equal To: " + isGreaterThanOrEqualTo);
        System.out.println("Is Less Than or Equal To: " + isLessThanOrEqualTo);

        // Perform logical operations
        boolean logicalAnd = (a > 0) && (b > 0);
        boolean logicalOr = (a > 0) || (b < 0);

        boolean logicalNot = !(a > 0);  
        System.out.println("Logical AND: " + logicalAnd);
        System.out.println("Logical OR: " + logicalOr);
        System.out.println("Logical NOT: " + logicalNot);

        // Perform assignment operations
        int c = 10;
        c += 5; // c = c + 5
        System.out.println("After += operation, c: " + c);
        c -= 3; // c = c - 3
        System.out.println("After -= operation, c: " + c);
        c *= 2; // c = c * 2
        System.out.println("After *= operation, c: " + c);
        c /= 4; // c = c / 4
        System.out.println("After /= operation, c: " + c);  
        

    }
    
}
