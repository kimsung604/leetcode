package easy.string;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }

    private static boolean isPalindrome(String s) {

        int leftIndex = 0;
        int rightIndex = s.length() - 1;

        while (leftIndex < rightIndex) {
            char c1 = s.charAt(leftIndex);
            if (!Character.isLetterOrDigit(c1)) {
                leftIndex++;
                continue;
            }

            char c2 = s.charAt(rightIndex);
            if (!Character.isLetterOrDigit(c2)) {
                rightIndex--;
                continue;
            }

            if (Character.toUpperCase(c1) != Character.toUpperCase(c2)) {
                return false;
            }

            leftIndex++;
            rightIndex--;
        }

        return true;
    }
}
