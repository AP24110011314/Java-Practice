import java.util.ArrayList;
public class _3ForEachLoop {
    public static void main(String[] args) {
        // for each loop is used to iterate through the elements of an array or a collection.
        // It is also known as the enhanced for loop.
        // Syntax: for (dataType variable : array/collection) {
        //     // code to be executed
        // }
        // // Example of for each loop with an array
        // int[] numbers = {1, 2, 3, 4, 5};
        // System.out.println("Using for each loop with an array:");
        // for (int number : numbers) {
        //     System.out.println(number); 
        // }

        // Example of for each loop with an ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");     
        fruits.add("Grapes");
        fruits.add("Mango");
        System.out.println(fruits);   
        
        System.out.println("Using For each iterations : ");
        for(String frt : fruits){
            System.out.println(frt);
        }
        
     }
}
