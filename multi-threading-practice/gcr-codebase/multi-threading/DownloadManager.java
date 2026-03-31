import java.util.Random;

class DownloadManagerThread implements Runnable {

    private String fileName;
    Random random = new Random();

    public DownloadManagerThread(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i += 10) {
            System.out.println(
                Thread.currentThread().getName() +
                " downloading: " + fileName + " : " + i + "%"
            );
            try {
                Thread.sleep(500 + random.nextInt(300));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(fileName + " downloaded by: " +
                Thread.currentThread().getName());
    }
}

public class DownloadManager {
    public static void main(String[] args) {

        Thread t1 = new Thread(new DownloadManagerThread("abc.jpg"), "Thread-1");
        Thread t2 = new Thread(new DownloadManagerThread("kfg.mp4"), "Thread-2");
        Thread t3 = new Thread(new DownloadManagerThread("image.jpg"), "Thread-3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All downloads completed.");
    }
}
