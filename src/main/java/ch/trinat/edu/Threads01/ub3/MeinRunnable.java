package Threads01.ub3;

public class MeinRunnable implements Runnable {
    @Override
    public void run() {
        los();
    }
    private void los() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tuNochMehr();
    }
    private void tuNochMehr() {
        System.out.println("Oben auf den Stack");
    }
}
