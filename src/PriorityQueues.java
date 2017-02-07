import java.nio.DoubleBuffer;
import java.util.PriorityQueue;

/**
 * Created by mac on 2/6/17.
 */
public class PriorityQueues {
    public static void main(String[] args) {
        //create queue capacity of 11

        java.util.PriorityQueue<Double> queue = new java.util.PriorityQueue<>();
        queue.offer(2.3);
        queue.offer(3.6);
        queue.offer(5.8);

        System.out.println("Polling from the queue");

        while(queue.size() > 0){

            System.out.printf("%.1f ", queue.peek());
            queue.poll();

        }

    }
}
