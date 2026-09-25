//encapsulation is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. 
// In encapsulation, the variables of a class will be hidden from other classes, 
// and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.

class car{
    private String name;
    private String color;
    private int year;

    car(String name, String color, int year){
        this.setname(name);
        this.setcolor(color);
        this.setyear(year);
    }
    //setter methods
    public void setname(String name){
        this.name = name;
    }
    public void setcolor(String color){
        this.color = color;

    }
    public void setyear(int year){
        this.year = year;
    }
    //getter methods
    public String getname(){
        return this.name;
    }
    public String getcolor(){
        return this.color;
    }
    public int getyear(){
        return this.year;
    }


}


public class _10Encapsulation {
    public static void main(String[] args){
        car c1 = new car("BMW", "Black", 2020);
        // Accessing private variables through getter methods
        System.out.println("Car name: " + c1.getname());
        System.out.println("Car color: " + c1.getcolor());
        System.out.println("Car year: " + c1.getyear());
        // System.out.println("Car name: " + c1.name); // This will give an error because name is private
        //Setting new values using setter methods
        c1.setname("Audi");
        System.out.println("Updated Car name: " + c1.getname());
    }
    
}
