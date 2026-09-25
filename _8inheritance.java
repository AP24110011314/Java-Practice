class vehicle{
    int milage;
    String color;
    vehicle(int milage, String color){
        this.milage=milage;
        this.color=color;
    }
    void start(){
        System.out.println("Vehicle is starting");
    }
    void showDetails(){
        System.out.println("Vehicle Details : ");
        System.out.println("Milage : "+milage+" , Color : "+color);
    }
}
class bike extends vehicle{
    int weels;
    int price;
    bike(int milage, String color, int weels, int price){
        super(milage, color);
        this.weels=weels;
        this.price=price;
    }
    void showDetails(){
        System.out.println("Bike Details : ");
        System.out.println("Milage : "+milage+" , Color : "+color+" , Weels : "+weels+" , Price : "+price);
    }
}
//showDetails() is an example of method overriding. The showDetails() method in the bike class overrides
//  the showDetails() method in the vehicle class.
//super keyword is used to call the constructor of the parent class.
//  In this example, we are calling the constructor of the vehicle class 
// from the constructor of the bike class.
//method overriding is run time polymorphism. 
// The method to be called is determined at run time based on the object type.

public class _8inheritance {

    public static void main(String[] args){
        bike bike1 = new bike(50, "Red", 2, 100000);
        bike1.start();
        bike1.showDetails();
        System.out.println();
        vehicle vehicle1 = new vehicle(30, "Blue");
        vehicle1.start();
        vehicle1.showDetails();
    }
}
