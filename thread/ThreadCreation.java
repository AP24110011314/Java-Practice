
class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 5){
            System.out.println("Thread 1 is running");
            System.out.println("Chatting with friends");
            i++;
        }
    }
}   

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 5){
            System.out.println("Thread 2 is running");
            System.out.println("Cooking food");
            i++;
        }
    }
}




public class ThreadCreation {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
        thread1.start();
        thread2.start();
    
    }
}