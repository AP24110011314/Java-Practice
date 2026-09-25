package access_specifier.package2;
import access_specifier.package1.*;

public class Asub extends A{
    public static void main(String[] args){
        Asub a = new Asub();
        System.out.println(a.protectedmessage); //this will work because protectedmessage is protected 
        // access specifier and it is accessible within the package and outside the package through inheritance.
    }

}