class car{
    private String name;
    private String color;
    private int year;

    car(String name, String color, int year){
        this.setname(name);
        this.setcolor(color);
        this.setyear(year);
    }
    car(car x){
        this.setname(x.getname());
        this.setcolor(x.getcolor());
        this.setyear(x.getyear());

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
    public void copy(car other){
        this.setname(other.getname());
        this.setcolor(other.getcolor());
        this.setyear(other.getyear());
    }


}


public class _11Copyobject {
    public static void main(String[] args){
        car c1 = new car("BMW", "Black", 2020);
        car c2 = new car("Audi", "White", 2021);
        System.out.println(c1);
        System.out.println(c2);
        //get methods
        System.out.println();
        System.out.println("Car 1 name: " + c1.getname());
        System.out.println("Car 1 color: " + c1.getcolor());
        System.out.println("Car 1 year: " + c1.getyear());
        System.out.println();
        System.out.println("Car 2 name: " + c2.getname());
        System.out.println("Car 2 color: " + c2.getcolor());
        System.out.println("Car 2 year: " + c2.getyear());  

        //c2.copy(c1); this will copy the values of c1 to c2 using the copy method
        c2.copy(c1);
        car c3 = new car(c1.getname(), c1.getcolor(), c1.getyear()); // this will copy the values of c1 to c3 using the constructor
        car c4 = new car(c3);











        System.out.println();
        System.out.println("After copying c1 to c2");
        System.out.println("Car 1 name: " + c1.getname());
        System.out.println("Car 1 color: " + c1.getcolor());
        System.out.println("Car 1 year: " + c1.getyear());
        System.out.println();
        System.out.println("Car 2 name: " + c2.getname());
        System.out.println("Car 2 color: " + c2.getcolor());
        System.out.println("Car 2 year: " + c2.getyear()); 
        System.out.println();

        System.out.println("Car 3 name: " + c3.getname());
        System.out.println("Car 3 color: " + c3.getcolor());
        System.out.println("Car 3 year: " + c3.getyear()); 
        System.out.println();

        System.out.println("Car 4 name: " + c4.getname());
        System.out.println("Car 4 color: " + c4.getcolor());
        System.out.println("Car 4 year: " + c4.getyear()); 


    }
       
    
}

