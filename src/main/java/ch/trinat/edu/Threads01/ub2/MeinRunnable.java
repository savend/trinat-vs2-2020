package Threads01.ub2;

public class MeinRunnable implements Runnable {
    @Override
    public void run() {
        los();
    }
    private void los() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tuNochMehr();
    }
    private void tuNochMehr() {
        System.out.println("Oben auf den Stack");
    }
}
