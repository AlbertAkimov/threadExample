/**
 * @Authot: Albert Akimov
 * @Date: 31.05.2021
 * @Description:
 */
public class Task extends Thread {

    public Task(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Task started: " + this);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task finished: " + this);
    }
}
