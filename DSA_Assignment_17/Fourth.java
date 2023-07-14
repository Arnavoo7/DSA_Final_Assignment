import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;

class Fourth {
    private Queue<Integer> requests;

    public Fourth() {
        requests = new LinkedList<>();
    }

    public Integer ping(int t) {
        // Add the current request time to the queue
        requests.offer(t);

        // Remove outdated requests from the queue
        while (!requests.isEmpty() && requests.peek() < t - 3000) {
            requests.poll();
        }

        // Return the number of requests within the time frame
        return requests.size();
    }

    public static void main(String[] args) {
        Fourth counter = new Fourth();

        Integer[] results = new Integer[5];

        results[0] = null;
        results[1] = counter.ping(1);
        results[2] = counter.ping(100);
        results[3] = counter.ping(3001);
        results[4] = counter.ping(3002);

        System.out.println(Arrays.toString(results));
    }
}
