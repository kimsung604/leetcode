package easy.array;

import java.util.Arrays;

public class Chaptor03RotateArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        reverse(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));

        int k = 3;

        k = k % nums.length;
        reverse(nums, 0, k - 1);
        System.out.println(Arrays.toString(nums));

        reverse(nums, k, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 1, 2, 3, 4, 5
     *
     * @param nums
     * @param start
     * @param end
     */
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}
