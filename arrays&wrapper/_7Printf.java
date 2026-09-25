
// 7. Printf is a method in Java that allows you to format and 
// print output to the console. It is part of the PrintStream class and 
// provides a way to create formatted strings using format specifiers.
// The printf method takes a format string and a variable number of arguments,
// and it replaces the format specifiers in the format string with the corresponding argument values.
// Different format specifiers can be used to control the output format, 
// such as %d for integers, %f for floating-point numbers, %s for strings, %c for characters, and  %b for boolean values.
// The printf method also allows you to specify width, precision, and alignment for the output,
// making it a powerful tool for creating well-formatted console output in Java.
public class _7Printf {
    public static void main(String[] args){
        // int a = 10;
        // int b = 20;
        // int sum = a + b;
        // System.out.printf("Sum of %d and %d is: %d", a, b, sum);
        // String name = "Ammu";
        // int age = 25;
        // System.out.printf("My name is %s and I am %d years old.", name, age);
        // //width and precision
        // double pi = 3.14159265359;
        // System.out.printf("\nValue of pi: %.2f", pi); // Output: Value of pi: 3.14
        // String str = "Hello, World!";
        // System.out.printf("\nJay Sri Ram %-20s", str);// Output: Jay Sri Ram Hello, World!__________%
        // System.out.printf("\nJay Sri Ram %20s", str);// Output: Jay Sri Ram __________Hello, World!%    
        int num = 5657567;
        System.out.printf("\nThe number is: %,d", num);

    }
    
}
