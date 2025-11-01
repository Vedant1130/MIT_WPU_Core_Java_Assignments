package Assignment_8.Q3;

public class Q3 {
    public static void main(String[] args) {
        MessageThread t6 = new MessageThread("Hello", 5);
        MessageThread t7 = new MessageThread("World", 5);
        t6.start();
        t7.start();
    }
}

class MessageThread extends Thread {
    private String message;
    private int count;

    MessageThread(String message, int count) {
        this.message = message;

        this.count = count;
    }

    public void run() {
        for (int i = 1; i <= count; i++) {
            System.out.println(message);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
