import java.util.UUID;
import java.util.concurrent.BlockingQueue;

public class BQConsumer implements Runnable{
    private BlockingQueue queue;

    public BQConsumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
       while (true) {
           try {
               System.out.println("Consumer ID-"+Thread.currentThread().getId()+ " :" + queue.take());
           } catch (InterruptedException e) {
               e.printStackTrace();
           }

       }

       // System.out.println("consuner completed");
    }
}
