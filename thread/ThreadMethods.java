
class mytrd1 extends Thread {
    
    public void run(){  
        int i = 0;    
        while (i < 10){
            System.out.println("I am Ammu's thread.");
            i++;
        }
    }
}

class mytrd2 extends Thread {
    
    public void run(){
        int i = 0;
        while (i < 10){
            System.out.println("I am a thread not a threat.");
            i++;
        }
    }
}



public class ThreadMethods {
    public static void main(String[] args) {
        mytrd1 t1 = new mytrd1();
        mytrd2 t2 = new mytrd2();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
       

    }
    
}
