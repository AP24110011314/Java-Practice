
class car{
    String color;
    String model;
    int year;
    double price;
    car(String color, String Model, int year, double price){
        this.color = color;
        this.model = Model;
        this.year = year;
        this.price = price;
    }
    void display(){
        System.out.println("Color: "+color);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
        System.out.println("Price: "+price);
    }

}
public class _01 {
    //object are created from class and they are called instance of class with the help of new keyword
    //class is a blueprint of object
    //object is a real world entity which has state and behavior, which conatins data and methods
    public static void main(String[] args){
        car c1 = new car("Red", "BMW", 2020, 50000);
        System.out.println("Color: " + c1.color);
        System.out.println();
        car c2 = new car("Blue", "Audi", 2021, 60000);
        System.out.println("Color: " + c2.color);
        System.out.println("Model: " + c2.model);
        System.out.println("Year: " + c2.year);
        System.out.println("Price: " + c2.price);   
        System.out.println();

    }
    //constructor is a special method which is used to initialize the object of class, 
    //  it has same name as class and it does not have return type
}
