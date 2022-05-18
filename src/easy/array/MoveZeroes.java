package easy.array;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 0, 3, 0, 4};
        //int[] nums = {0};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZeroes(int[] nums) {
        int zeroCount = 0;

        // 0以外のデーターを前に寄せる
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[zeroCount] = nums[i];
                zeroCount++;
            }
        }

        // 最後に0をつける
        for (int i = nums.length; i > zeroCount; i--) {
            nums[i - 1] = 0;
        }
    }

    static void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
