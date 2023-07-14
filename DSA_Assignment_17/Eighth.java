import java.util.ArrayDeque;
import java.util.Queue;

class DataStream {
    private Queue<Integer> elements;
    private int k;

    public DataStream(int k) {
        this.k = k;
        elements = new ArrayDeque<>();
    }

    public Boolean consec(int[] nums) {
        for (int num : nums) {
            elements.offer(num);
            if (elements.size() >= k) {
                int count = 0;
                int[] temp = new int[k];
                for (int i = 0; i < k; i++) {
                    temp[i] = elements.poll();
                }
                for (int i = 0; i < k; i++) {
                    elements.offer(temp[i]);
                }
                for (int i = 0; i < k; i++) {
                    if (temp[i] == num) {
                        count++;
                    }
                }
                if (count == k) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DataStream dataStream = new DataStream(4);

        Boolean[] results = new Boolean[6];

        results[0] = null;
        results[1] = dataStream.consec(new int[]{4, 3});
        results[2] = dataStream.consec(new int[]{4});
        results[3] = dataStream.consec(new int[]{4});
        results[4] = dataStream.consec(new int[]{4});
        results[5] = dataStream.consec(new int[]{3});

        System.out.println(java.util.Arrays.toString(results));
    }
}
