import java.util.*;

public class dequeueimp {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<Integer>();
        dq.add(10);
        dq.add(20);
        dq.add(30);
        dq.add(40);
        dq.addFirst(111);
        System.out.println("The Deque is: " + dq);
        for (int i = 0; i < dq.size(); i++) {
            System.out.println("The element at index " + i + " is: " + ((ArrayDeque<Integer>) dq).toArray()[i]);
        }
        System.out.println("The first element is: " + dq.getFirst());
    }
    
}
