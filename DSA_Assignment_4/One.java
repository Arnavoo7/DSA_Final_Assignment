import java.util.*;

class One{
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,5,7,9};
        int[] arr3 = {1,3,4,5,8};

        Set<Integer> set1 = toSet(arr1), set2 = toSet(arr2);

        List<Integer> rst = new ArrayList<>();
        for (int num : arr3) {
            if (set1.contains(num) && set2.contains(num)) {
                if (rst.size() == 0) rst.add(num);
                else if (rst.size() > 0 && rst.get(rst.size() - 1) != num) rst.add(num);
            }
        }

        System.out.println(rst);
    }

    private static Set<Integer> toSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        return set;
    }
}

