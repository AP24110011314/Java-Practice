// 6. Method Overloading is a feature that allows a class to have more than one method having the same name, 
// if their parameter lists are different. It is related to compile-time (or static) polymorphism.
//In Java, two or more methods can have the same name if they differ in the type or number of their parameters.

public class _6OverloadedMethod {
    static void add(){
        System.out.println("Choose any arguement type. ");


    }
    static void add(int x , int y){
        System.out.println("Sum is :"+(x+y));


    }
    static void add(int x, int y, double z){
        System.out.println("Sum of three numbers :"+(x+y+z));


    }
    static void add(double a, double b){
        System.out.println("Sum of double number is :"+(a+b));


    }
    static void add(char a, char b){
        System.out.println("The addition of Character is :"+('a'+'b'));//it will add the ascii value of the character
        //  and return the sum of it.


    }
    public static void main(String[] args){
        add();
        add(2,3);
        add(5,6,2.34);
        add(3.14,1.444);
        add('f','g');
        


    }
}
