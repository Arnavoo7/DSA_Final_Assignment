import java.util.Scanner;

public class Four {

    public static void main(String[] args) {

        int[] flowerbed = {1,0,0,0,1};

        Scanner sc = new Scanner(System.in);
        //new flowers (n)
        System.out.println("Enter (new flowerd) n: ");
        int n = sc.nextInt();
        int size = flowerbed.length;

        if (n == 0)
            System.out.println(true);

        for (int i = 0; i < size; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == size - 1 || flowerbed[i + 1] == 0)) {
                n--;
                if (n == 0) {
                    System.out.println(true);
                    break; // Exit the loop once n becomes zero
                }

                flowerbed[i] = 1;
            }
        }

        if (n != 0) {
            System.out.println(false); // Print false if n is not zero after the loop
        }
    }
}
