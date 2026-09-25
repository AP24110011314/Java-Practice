class rabit implements prey{
    @Override
    public void flee() {
        System.out.println("Rabit is fleeing...");
    }

}
class hawk implements predator{
    @Override
    public void hunt() {
        System.out.println("Hawk is hunting...");
    }

}
class fish implements prey , predator{
    @Override
    public void flee() {
        System.out.println("Fish is fleeing...");
    }

    @Override
    public void hunt() {
        System.out.println("Fish is hunting...");
    }
}
interface predator {
    void hunt();

}
interface prey {
    void flee();

}


//interface is a collection of abstract methods. It is used to achieve abstraction and 
// multiple inheritance in Java. An interface is a reference type, similar to a class, 
// that can contain only constants, method signatures, default methods, static methods, 
// and nested types. Interfaces cannot contain instance fields or constructors.

public class _12inerface {
    public static void main(String[] args){
        rabit r = new rabit();
        r.flee();
        hawk h = new hawk();
        h.hunt();
        fish f = new fish();
        f.flee();
        f.hunt();

    }
}
