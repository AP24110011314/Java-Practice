class Avengers{
    int age;
    Avengers(int age){
        this.age = age;

    }
    public String toString(){
        return "Age: "+this.age+"\n";

    }
}
class Ironman extends Avengers{
    String name;
    String power;
    Ironman(int age, String name, String power){
        super(age);
        this.name = name;
        this.power = power;

    }
    public void display(){
        System.out.print(super.toString());
        System.out.println("Name: "+this.name);
        System.out.println("Power: "+this.power);
    }



}
//Super keyword is used to refer to the parent class object.
//  It is used to access the parent class methods and variables.
//  It is also used to call the parent class constructor.
public class _9super {
    public static void main(String args[]){
        
        Ironman ironman = new Ironman(45, "Ironman", "Flying");
        ironman.display();

    }
}
