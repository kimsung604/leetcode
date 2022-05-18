package easy.string;

public class ImplementStrStr {
    public static void main(String[] args) {
        System.out.println(strStr("abcdef", "ff"));
    }

    private static int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
                if (haystack.charAt(i + j) == needle.charAt(j) && j == needle.length() - 1) {
                    return i;
                }
            }
        }

        return -1;
    }
}
