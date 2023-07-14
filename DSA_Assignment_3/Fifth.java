import java.util.Arrays;

class Fifth{

    public static void main(String[] args) {

        int[] digits = {1,2,3};
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
            System.out.println(Arrays.toString(newDigits));
        }

        System.out.println(Arrays.toString(digits));
    }
}
