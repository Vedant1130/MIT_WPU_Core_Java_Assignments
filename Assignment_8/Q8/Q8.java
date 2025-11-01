package Assignment_8.Q8;

public class Q8 {
    public static void main(String[] args) {

        MessageTask helloTask = new MessageTask("Hello!", 1000);
        MessageTask maskTask = new MessageTask("Wear Mask!", 2000);
        MessageTask sanitizerTask = new MessageTask("Use Sanitizer!", 5000);

        Thread t1 = new Thread(helloTask);
        Thread t2 = new Thread(maskTask);
        Thread t3 = new Thread(sanitizerTask);

        t1.start();
        t2.start();
        t3.start();
    }
}

class MessageTask implements Runnable {
    String message;
    int interval;

    MessageTask(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(message);
                Thread.sleep(interval);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}