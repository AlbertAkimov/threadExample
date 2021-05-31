import java.util.ArrayList;

/**
 * @Authot: Albert Akimov
 * @Date: 31.05.2021
 * @Description:
 */
public class BlockingQueue {

    private ArrayList<Runnable> tasks;

    public BlockingQueue() {
        initQueue();
    }

    private void initQueue() {
        tasks = new ArrayList<>();
    }

    public synchronized Runnable getTaskFromQueue() {

        while (tasks.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Runnable task = tasks.get(0);
        tasks.remove(task);
        return task;
    }

    public synchronized void putToQueue(Runnable task) {
        tasks.add(task);
        notify();
    }
}
