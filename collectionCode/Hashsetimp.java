import java.util.*;


public class Hashsetimp {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>(10, 0.75f);
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(40);
        System.out.println("The HashSet is: " + hs);
        for (Integer i : hs) {
            System.out.println("The element is: " + i);
        }
        System.out.println(hs.size());
    }

    
}
 