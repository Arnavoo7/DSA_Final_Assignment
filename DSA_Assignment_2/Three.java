import java.util.HashMap;

public class Three {

    public static void main(String[] args) {

        int[] nums = {1,3,2,2,5,2,3,7};
        HashMap < Integer, Integer > map = new HashMap < > ();
        int result = 0;

        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key: map.keySet()) {
            if (map.containsKey(key + 1))
                result = Math.max(result, map.get(key) + map.get(key + 1));
        }

        System.out.println("Output is: "+result);;

    }
}
