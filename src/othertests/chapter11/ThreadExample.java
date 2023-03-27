package othertests.chapter11;

public class ThreadExample {

    public static void main(String[] args) {
        Thread myNewThread = new Thread(new MyThread());
        myNewThread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("MainThread" + i);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
