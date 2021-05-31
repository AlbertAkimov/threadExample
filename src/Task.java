/**
 * @Authot: Albert Akimov
 * @Date: 31.05.2021
 * @Description:
 */
public class Task implements Runnable {

    @Override
    public void run() {
        System.out.println("Task started: " + this);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task finished: " + this);
    }
}
