import java.util.UUID;
import java.util.concurrent.BlockingQueue;

public class BQProducer implements Runnable{
    private BlockingQueue queue;

    public BQProducer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
       int i=0;
        while (true){
            String uid=String.valueOf(++i);
            try {
                queue.put(uid);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Proucer ID-"+Thread.currentThread().getId()+":"+uid);

        }
        //System.out.println("Producer completed");
    }
}
