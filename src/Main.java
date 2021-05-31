/**
 * @Authot: Albert Akimov
 * @Date: 31.05.2021
 * @Description:
 */
public class Main {

    public static void main(String[] args) {

        BlockingQueue blockingQueue = new BlockingQueue();

        Thread worker = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    Runnable task = blockingQueue.getTaskFromQueue();
                    task.run();
                }
            }
        });

        worker.setName("worker_thread");
        worker.start();

        for(int i = 0; i < 10; i++)
            blockingQueue.putToQueue(new Task());
    }
}
