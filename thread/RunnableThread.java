
class MyThreadRunnable1 implements Runnable {
    public void run(){
        int i = 0;
        while (i < 100){
            System.out.println("I am a thread 1 not a threat.");
            i++;
        }
    }

}
class MyThreadRunnable2 implements Runnable {
    public void run(){
        int i = 0;
        while (i < 100){  
            System.out.println("I am a thread 2 not a threat.");
            i++;
        }
    }

}
public class RunnableThread {
    public static void main(String[] args) {
        
        MyThreadRunnable1 t1 = new MyThreadRunnable1();
        MyThreadRunnable2 t2 = new MyThreadRunnable2();
        Thread thread1 = new Thread(t1);    
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();


    }
    
}
