import java.util.Random;
//local variable are declared inside the method and can be used only inside the method.
//whereas instance variable are declared inside the class but 
// outside the method and can be used anywhere inside the class.
// instance variable are created when the object is created and destroyed when the object is destroyed.
// instance variable are also called as field or attribute of the class.
// instance variable are also called as global variable because they can be used anywhere 
// inside the class.
class Dice_rollar{
    int number;
    Random rand;
    Dice_rollar(){
        rand = new Random();
        roll();
        
    }
     void roll(){
        number = rand.nextInt(6) + 1;
        System.out.printf("The number on the dice is %d .", number);
    }

}

public class _3loc {
    public static void main(String[] args){
        Dice_rollar dice = new Dice_rollar();
    }
}
 