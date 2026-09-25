package access_specifier.package2;
import access_specifier.package1.*;
 public class C {
    String defaultmessage = "This is default message";//this is default access specifier and 
    // it is accessible only within the package.
    public String publicmessage = "This is public message";
    //this is public access specifier and it is accessible outside the package.
    protected String protectedmessage = "This is protected message";
    //this is protected access specifier and it is accessible within the package and outside the package through inheritance.
}
