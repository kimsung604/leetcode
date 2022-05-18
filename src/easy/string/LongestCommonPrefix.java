package easy.string;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] inputs = {"abbc", "ab", "ab"};
        System.out.println(longestCommonPrefix(inputs));
    }

    private static String longestCommonPrefix(String[] strs) {
        StringBuilder rslt = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            char current = strs[0].charAt(i);
            boolean isCommon = false;

            for (String str : strs) {
                if (str.length() <= i) {
                    isCommon = false;
                    break;
                }

                if (str.charAt(i) != current) {
                    isCommon = false;
                    break;
                }
                isCommon = true;
            }

            if (!isCommon) {
                break;
            }

            rslt.append(current);
        }

        return rslt.toString();

    }
}
