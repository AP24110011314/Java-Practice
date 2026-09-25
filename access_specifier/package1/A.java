package access_specifier.package1;
import access_specifier.package2.*;

public class A {
    protected String protectedmessage = "This is protected message";
    B b = new B();
   // System.out.println(b.privatemessage); 
    //this will give error because privatemessage is private access specifier and 
    // it is not accessible outside the class.



    //public static void main(String[] args){
        //C c = new C();
       //System.out.println(c.defaultmessage); //this will give error because defaultmessage is default 
       // access specifier and it is not accessible outside the package.
         //System.out.println(c.protectedmessage); //this will give error because protectedmessage is protected 
         // access specifier and it is not accessible outside the package.
         //System.out.println(c.publicmessage); 
          //this will work because publicmessage is public access specifier and it is accessible outside the package.   
    // }
    
}
