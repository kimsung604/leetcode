package hard;

public class Chaptor01ProductOfArrayExeptSelf {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        productExceptSelf(nums);
    }

    /**
     * nums = [a, b, c, d, e]
     * <p>
     * step 1
     * lNums = [1      , a    , a*b, a*b*c, a*b*c*d]
     * rNums = [b*c*d*e, c*d*e, d*e, e    , 1]
     * result = [1*b*c*d*e, a*c*d*e, a*b*d*e, a*b*c*e, a*b*c*d*1]
     *
     * @param nums
     * @return
     */
    private static int[] productExceptSelf(int[] nums) {
        int length = nums.length;

        int[] lNums = new int[nums.length];
        int[] rNums = new int[nums.length];

        lNums[0] = 1;
        rNums[length - 1] = 1;

        for (int i = 1; i < length; i++) {
            lNums[i] = lNums[i - 1] * nums[i - 1];
        }

        rNums[length - 1] = 1;
        for (int i = length - 1; i > 0; i--) {
            rNums[i - 1] = rNums[i] * nums[i];
        }

        for (int i = 0; i < length; i++) {
            lNums[i] = lNums[i] * rNums[i];
        }

        return lNums;
    }
}
