import java.util.*;

class Sixth{
    public static void main(String[] args) {

        int[] changed = {1,3,4,2,6,8};
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new ArrayDeque<>();

        Arrays.sort(changed);

        for (final int num : changed)
            if (!q.isEmpty() && num == q.peek()) {
                q.poll();
            } else {
                q.offer(num * 2);
                ans.add(num);
            }

        System.out.println(q.isEmpty() ? Arrays.toString(ans.stream().mapToInt(Integer::intValue).toArray()) : new int[] {});
    }
}