class mythread extends Thread {
    public mythread(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while (i < 10){
            System.out.println("I am a thread not a threat.");
            i++;
        }
    }
}



public class ThreadConstructor {
    public static void main(String[] args) {
        mythread t1 = new mythread("Chatting");
        mythread t2 = new mythread("Cooking");  
        t2.start();
        t1.start();
        System.out.println("Thread name is: " + t1.getName());
        System.out.println("Thread id is: " + t1.getId());
        System.out.println("Thread name is: " + t2.getName());
        System.out.println("Thread id is: " + t2.getId());

    }
    
}
