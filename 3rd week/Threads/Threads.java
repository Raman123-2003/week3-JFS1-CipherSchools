class Worker extends Thread {
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("Thread 1 Running .. " + new java.util.Date());
            try {
                Thread.sleep(1000); // 1000 ms = 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Testo {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.start();
    }
}
