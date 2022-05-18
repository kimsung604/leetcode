package easy.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SingleNumber {
    public static void main(String[] args) {
        //int[] nums = new int[]{1, 2, 1, 2, 4, 4, 10};
        int[] nums = new int[]{0, 1, 0, 1, 0, 1, 99};
        nums = new int[]{5, 4, 5, 4, 5, 4, 10};
        System.out.println(singleNumber(nums));
        //System.out.println(1 ^ 3);
    }

    private static int singleNumber(int[] nums) {
       /* int xor = 0;
        for (int num : nums) {
            xor = xor ^ num;
        }
        return xor;*/
        // readable
        return Arrays.stream(nums).boxed()
                .collect(Collectors.toMap(i -> i, v -> 0, (v1, v2) -> ++v1))
                .entrySet().stream()
                .filter(m -> m.getValue() <= 0)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(-1);

    }
}
