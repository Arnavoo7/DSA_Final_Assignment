import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

class Fourth{
    public static void main(String[] args) {

        int[] nums1 = {1,2,3}, nums2 = {2,4,6};
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        Arrays.stream(nums1).forEach(set2::remove);
        Arrays.stream(nums2).forEach(set1::remove);

        System.out.println(Arrays.asList(new ArrayList<>(set1), new ArrayList<>(set2)));
    }
}