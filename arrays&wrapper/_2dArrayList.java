import java.util.ArrayList;
public class _2dArrayList {
    public static void main(String[] args){
        // 2D ArrayList in Java
        //Important Points:
        // 1. A 2D ArrayList is an ArrayList of ArrayLists.
        // 2. It can be used to store data in a tabular form.
        // 3. It is dynamic in nature, meaning it can grow and shrink in size as needed.
        // 4. It allows for easy manipulation of the data, such as adding or removing rows and columns. 
        // 5. Each row in the 2D ArrayList is an ArrayList itself.
        // 6. The elements in each row can be of any data type.
        // 7. It is part of the java.util package and provides various methods to add, remove, and access elements in the list.
        // 8. The size of each row can be different. 
        // Syntax: ArrayList<ArrayList<DataType>> list = new ArrayList<>();
        // Initializing a 2D ArrayList
        //ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // Initialization of 2D ArrayList
        ArrayList<String> drinkArrayList = new ArrayList();
        ArrayList<String> foodArrayList = new ArrayList();
        ArrayList<String> snackArrayList = new ArrayList();
        drinkArrayList.add("Coke");
        drinkArrayList.add("Pepsi");
        foodArrayList.add("Pizza");
        foodArrayList.add("Burger");    
        snackArrayList.add("Chips");
        snackArrayList.add("Cookies");  
        snackArrayList.add("Noodles");
        System.out.println("Drink ArrayList: " + drinkArrayList);
        System.out.println("Food ArrayList: " + foodArrayList);
        System.out.println("Snack ArrayList: " + snackArrayList);
        ArrayList<ArrayList<String>> Grocerrylist = new ArrayList<>();      
        Grocerrylist.add(drinkArrayList);
        Grocerrylist.add(foodArrayList);
        Grocerrylist.add(snackArrayList);
        System.out.println("Grocerry List: " + Grocerrylist); 
        // System.out.println("Size of Grocerry List: " + Grocerrylist.size());
        // //first element of first list
        // System.out.print("First Element of first Array List: "+Grocerrylist.get(0).get(0));
        Grocerrylist.get(0).add("Beverage");
        System.out.println(Grocerrylist.get(0));
    }
}
