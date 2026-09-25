import java.util.Scanner;
class  animal{
    void makeSound(){
        System.out.println("Animal is making sound");
    }
}
class dog extends animal{
    @Override
    void makeSound(){
        System.out.println("Dog is barking");
    }
}
class cat extends animal{
    @Override
    void makeSound(){
        System.out.println("Cat is meowing");
    }
}


//dynamic polymorphism is also known as runtime polymorphism. 
// It is achieved through method overriding. In dynamic polymorphism,
//  the method to be called is determined at runtime based on the object
//  being referred to by the reference variable. This allows for more flexible and 
// extensible code, as new classes can be added without modifying existing code.



public class _14dynamicpoly {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the animal type (dog/cat): ");
        String animalType = sc.nextLine();
        if(animalType.equalsIgnoreCase("dog")){
            animal a = new dog();
            a.makeSound();
        }else if(animalType.equalsIgnoreCase("cat")){
            animal a = new cat();
            a.makeSound();
        }else{
            System.out.println("Invalid animal type");
            animal a = new animal();
            a.makeSound();
        }
    }
    
}
