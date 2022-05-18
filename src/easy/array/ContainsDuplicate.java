package easy.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> collect = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return nums.length != collect.size();
    }
}
