package easy.array;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] ints = {1, 9, 9};
        System.out.println(Arrays.toString(plusOne(ints)));
    }

    private static int[] plusOne(int[] digits) {
        int length = digits.length;

        if (digits[length - 1] < 9) {
            ++digits[length - 1];
            return digits;
        }

        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] + 1 < 10) {
                ++digits[i];
                return digits;
            }

            digits[i] = 0;
            if (i == 0) {
                int[] afterPlus = new int[length + 1];
                afterPlus[i] = 1;
                return afterPlus;
            }
        }

        return digits;
    }
}
