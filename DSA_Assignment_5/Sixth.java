import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Sixth {

    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};

        List<Integer> resultSet = new ArrayList<>();

        // Set to store unique numbers
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : nums) {

            // If already present, then it is a duplicate
            if (uniqueSet.contains(num))
                resultSet.add(num);

            // Add the number to the set
            uniqueSet.add(num);
        }

        System.out.println(resultSet);
    }
}