import java.util.*;

class Eighth{

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        Eighth e = new Eighth();
        int[] intersection = e.intersect(nums1, nums2);

        System.out.println(Arrays.toString(intersection)); // Output: [2, 2]
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums1) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> intersection = new ArrayList<>();

        for (int num : nums2) {
            if (freqMap.containsKey(num) && freqMap.get(num) > 0) {
                intersection.add(num);
                freqMap.put(num, freqMap.get(num) - 1);
            }
        }

        int[] result = new int[intersection.size()];

        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }

        return result;
    }

}

