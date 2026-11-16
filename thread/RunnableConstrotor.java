class mythread implements Runnable {
    public mythread(String name){
        Thread.currentThread().setName (name);
    }
    public void run(){
        System.out.println("I am a thread not a threat.");
    }
}


public class RunnableConstrotor {
    public static void main(String[] args) {
        mythread t1 = new mythread("Chatting");
        mythread t2 = new mythread("Cooking");
        Thread thread1 = new Thread(t1, "Chatting");
        Thread thread2 = new Thread(t2, "Cooking");
        thread1.start();
        thread2.start();
        System.out.println("Thread name is: " + thread1.getName());
        System.out.println("Thread id is: " + thread1.getId());
        System.out.println("Thread name is: " + thread2.getName());
        System.out.println("Thread id is: " + thread2.getId());
    }
    
}
