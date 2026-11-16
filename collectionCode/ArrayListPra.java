import java.util.*;


public class ArrayListPra {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        System.out.println("The ArrayList is: " + l1);
        for (int i = 0; i < l1.size(); i++) {
            System.out.println("The element at index " + i + " is: " + l1.get(i));
        }
    }
    
}
