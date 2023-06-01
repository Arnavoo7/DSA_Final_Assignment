import java.util.HashSet;
import  java.util.Set;

public class Two {

    public static void main(String[] args) {

        int[] candyType = {1,1,2,2,3,3};
        Set<Integer> candies = new HashSet<>();
        for (int candy: candyType) {
            candies.add(candy);
        }

        System.out.println( Math.min(candies.size(), candyType.length / 2) );
    }
}
