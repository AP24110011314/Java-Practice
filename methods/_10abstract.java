abstract class vehicle {
    abstract void run();//abstract method does not have body, it is only declaration
    //abstract method must be implemented in every child class
    void display(){
        System.out.println("This is a vehicle");
    }
}
//abstract class cannot be instantiated, but it can have a constructor
//means we cannot make object of abstract class but we can make
//constructor of abstract class and we can call it from child class
//abstract class add some additional layer of security to the class, 
//so that no one can make object of that class
class bike extends vehicle {
    void run() {
        System.out.println("Bike is running safely");
    }
}



public class _10abstract {
    public static void main(String[] args){

        //Vehicle v = new bike();// we can make reference of abstract class but
        //  we cannot make object of abstract class
       
        
        bike b = new bike();
        b.run();
        b.display();


    }
    
}
