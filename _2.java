class Human{
    String name;
    int age;
    Human (String name, int age){
        this.name = name;
        this.age = age;
        // here this keyword is used to refer the current object of class,
        //  it is used to differentiate the instance variable and local variable.
        //this keyword is use for instance variable, constructor and method of class.
    }
    void display(){
        System.out.printf("The name of the man is %s and the age of the man is %d .", name, age );
    }



}


public class _2 {
    public static void main(String[] args){
        Human h1 = new Human("Ammu", 22);
        h1.display();

    }
    
}
