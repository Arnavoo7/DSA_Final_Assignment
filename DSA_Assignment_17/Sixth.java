import java.util.Arrays;
import java.util.LinkedList;

class Sixth{
    public static int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);

        LinkedList<Integer> revealed = new LinkedList<>();
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                revealed.addFirst(deck[i]);
            } else {
                revealed.addFirst(revealed.removeLast());
                revealed.addFirst(deck[i]);
            }
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = revealed.removeFirst();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] deck = {1,1000};
        int[] result = deckRevealedIncreasing(deck);
        System.out.println("Revealed card order: " + Arrays.toString(result));
    }
}
