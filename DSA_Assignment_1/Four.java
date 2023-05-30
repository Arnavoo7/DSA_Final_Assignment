import java.util.Arrays;

class Four {

    public int[] incrementing(int[] digits) {

        final int len = digits.length;

        int[] newDigits = new int[len + 1];
        int carry = 1;
        int currSum = 0;
        for (int i = len - 1; i >= 0; i--) {
            currSum = digits[i] + carry;
            if (currSum > 9) {
                digits[i] = currSum % 10;
                newDigits[i + 1] = digits[i];
                carry = 1;
            } else {
                digits[i] = currSum;
                newDigits[i + 1] = digits[i];
                carry = 0;
                break;
            }
        }

        if (carry == 1) {
            newDigits[0] = 1;
            return newDigits;
        }

        return digits;
    }


    public static void main(String[] args) {

        int[] arr = {1,2,3};

        Four f = new Four();
        System.out.println("The Result is: "+Arrays.toString(f.incrementing(arr)));

    }
}
