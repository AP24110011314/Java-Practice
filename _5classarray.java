class Food{
    String name;
    int price;
    Food(String name, int price){
        this.name = name;
        this.price = price;
    }
    void display(){
        System.out.println("Food name : "+name+" , Price : "+price+" .");
        
    }

}

//Arrays of objects are used to store multiple objects of the same class in a single variable.
//In this example, we are creating an array of objects of the class Food and storing 
// the objects in the array.
public class _5classarray {
    public static void main(String[] args) {
        //creating an array of objects
        
        Food food1 = new Food("Pizza", 250);
        Food food2 = new Food("Burger", 150);
        Food food3 = new Food("Pasta", 200);

        // Food[] food = new Food[3];
        // food[0] = food1;
        // food[1] = food2;
        // food[2] = food3; 
        
        Food[] food = {food1, food2, food3}; 
        for(int i=0; i<food.length; i++){
            System.out.println(food[i]);
            System.out.println(food[i].name);
            System.out.println(food[i].price);
            food[i].display();
        }
       
    }
}
