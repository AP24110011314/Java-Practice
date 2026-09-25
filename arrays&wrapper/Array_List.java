import java.util.ArrayList;
public class Array_List {
    public static void main(String[] args) {
        //ArrayList is a resizable array implementation in Java that allows you to store 
        // and manipulate a collection of elements. 
        // It is part of the java.util package and provides various methods to 
        // add, remove, and access elements in the list.
        // In this example, we will create an ArrayList of strings and perform some basic 
        // operations on it.
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("Fruits: " + fruits); 
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
        //Arraylist methods
        fruits.remove("Banana");//removes the specified element from the list
        System.out.println("Fruits after removing Banana: " + fruits);
        fruits.set(0, "Mango");//replaces the element at the specified position in the list with the specified element
        System.out.println("Fruits after replacing Apple with Mango: " + fruits);
        System.out.println("Size of the list: " + fruits.size());//returns the number of elements in the list
        System.out.println("Is the list empty? " + fruits.isEmpty());//returns true if the list contains no elements
        fruits.clear();//removes all elements from the list
        System.out.println("Fruits after clearing the list: " + fruits);
        System.out.println("Size of the list after clearing: " + fruits.size());    
        fruits.add("Grapes");//adds the specified element to the end of the list
        fruits.add("Pineapple");
        System.out.println("Fruits after adding Grapes and Pineapple: " + fruits);
    
    }
}
