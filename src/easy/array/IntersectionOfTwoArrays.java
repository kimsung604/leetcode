package easy.array;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 3};
        int[] nums2 = new int[]{2, 2, 1};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    private static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int index1 = 0;
        int index2 = 0;

        List<Integer> rslt = new ArrayList<>();

        while (index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] == nums2[index2]) {
                rslt.add(nums1[index1]);
                index1++;
                index2++;
            } else if (nums1[index1] < nums2[index2]) {
                index1++;
            } else {
                index2++;
            }

        }
        return rslt.stream().mapToInt(i -> i).toArray();

    }
}
