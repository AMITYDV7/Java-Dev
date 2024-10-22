package MultiThreading;

class Demo extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world");
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.start();

        for (int i = 0; i <10 ; i++) {
            System.out.println("Main Method");
        }
    }
}
