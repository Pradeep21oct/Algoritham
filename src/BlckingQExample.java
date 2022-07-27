import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class BlckingQExample {

    public static void main(String[] args) {
        BlockingQueue queue=new LinkedBlockingDeque(5);
        ExecutorService produceMessagePool = Executors.newFixedThreadPool(1);
        ExecutorService consumerMessagePool = Executors.newFixedThreadPool(1);

        produceMessagePool.submit(new BQProducer(queue));
        consumerMessagePool.submit(new BQConsumer(queue));
        produceMessagePool.shutdown();
        consumerMessagePool.shutdown();
    }
}
