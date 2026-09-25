//toString() method is used to return the string representation of the object. 
// it will return the class name along with the hashcode of the object. 
// Additionally, we can override the toString() method to return 
// the string representation of the object in a more meaningful way.

class Car{
    String model = "Suzuki";
    int year = 2022;
    String color = "Red";
    


}


public class _4toString {
    public static void main(String[] args){
        Car car = new Car();
        //this will print the class name along with the hashcode of the object.
        System.out.println(car);
        System.out.println(car.toString());
        System.out.println();
        
        NewCar car2 = new NewCar();
        //this will print the string representation of the object in a more meaningful way.
        System.out.println(car2);
        System.out.println(car2.toString());
        
        
    }
}

class NewCar{
    String model = "Bleno";
    int year = 2025;
    String color = "Black";
    public String toString(){
        return "Car Details: "+model+" "+color+" "+year;
    }


}


