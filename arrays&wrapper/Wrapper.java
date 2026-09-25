public class Wrapper {
    public static void main(String[] args) {
        //werapper class objects are used to represent primitive data types as objects. 
        // Each primitive data type has a corresponding wrapper class in Java.
        //  The wrapper classes provide methods to convert between primitive types 
        // and their corresponding wrapper objects, as well as utility methods for working with the values.
        //wrapping is the process of converting a primitive data type into its corresponding
        //  wrapper class object. Unwrapping is the reverse process, where a wrapper class object is converted 
        // back into its corresponding primitive data type.
        //primitives: byte, short, int, long, float, double, char, boolean
        //wrapper classes: Byte, Short, Integer, Long, Float, Double, Character, Boolean
        //Boxing is the process of converting a primitive data type into its corresponding wrapper class object.
        //  Unboxing is the reverse process, where a wrapper class object is converted back into its corresponding 
        // primitive data type.
        //wrapping and unwrapping example
        //
    //    Integer num = 10; // wrapping
    //     int n = num; // unwrapping
    //     System.out.println("Wrapped value: " + num);
    //     System.out.println("Unwrapped value: " + n);
    //     num.compareTo(5); // compareTo() method is used to compare the value of the wrapper object with another value.  
    //     System.out.println("Octal representation: " + num.toOctalString(10));
        // toOctalString() method is used to convert the value of the wrapper object to its octal representation.

        // Character ch = 'A'; // wrapping
        // char c = ch; // unwrapping
        // System.out.println("Wrapped value: " + ch);
        // System.out.println("Unwrapped value: " + c);
        // System.out.println("Character: " + ch);
        // ch.isLowerCase('a'); // isLowerCase() method is used to check if the character is lowercase.
        // System.out.println("Is lowercase: " + ch.isLowerCase('a'));

        Double d = 3.14; // wrapping
        double db = d; // unwrapping
        System.out.println("Wrapped value: " + d);
        System.out.println("Unwrapped value: " + db);
        System.out.println("Double: " + d);
        d.isNaN(); // isNaN() method is used to check if the value of the wrapper object is NaN (Not a Number).
        System.out.println("Is NaN: " + d.isNaN());
        d.isInfinite(); // isInfinite() method is used to check if the value of the wrapper object is infinite.
        System.out.println("Is Infinite: " + d.isInfinite());
        System.out.println("Is Finite: " + Double.isFinite(d));
        d.isInfinite(); // isInfinite() method is used to check if the value of the wrapper object is infinite.
        System.out.println("Is Infinite: " + d.isInfinite());
        System.out.println("Is Finite: " + Double.isFinite(d));
        d.isNaN(); // isNaN() method is used to check if the value of the wrapper object is NaN (Not a Number).
        System.out.println("Is NaN: " + d.isNaN());
        d.isInfinite(); // isInfinite() method is used to check if the value of the wrapper object is infinite.
        System.out.println("Is Infinite: " + d.isInfinite());
        System.out.println("Is Finite: " + Double.isFinite(d));
    }   
}
