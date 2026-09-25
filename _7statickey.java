
class friends{
    static int no_of_friends;
    String name;
    friends(String name){
        this.name = name;
        no_of_friends++;
    }  
    static void display(){
        System.out.println("Number of friends : "+no_of_friends);
    }
}



public class _7statickey {
    //static variable are declared inside the class but outside the method with static keyword.
    //static variable are created when the class is loaded and destroyed when the class is unloaded.
    //static variable are also called as class variable because they are shared among all the objects of the class.
    //static variable are also called as global variable because they can be used anywhere inside the class.
    //A single copy of static variable is created and shared among all the objects of the class. 
    public static void main(String[] args){
        friends f1 = new friends("Ammu");
        friends f2 = new friends("Anu");
        friends f3 = new friends("Anju");
        friends f4 = new friends("Anish");
        //System.out.println("Number of friends : "+friends.no_of_friends);//this is also correct but we can also use static method to access static variable.
        friends.display();
    
    }
}
