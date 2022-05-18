package easy.string;

public class ReverseString {
    public static void main(String[] args) {
        char[] input = {'h', 'e', 'l', 'l', 'o', '1'};
        input = new char[]{'A', ' ', 'm', 'a', 'n', ',', ' ', 'a', ' ', 'p', 'l', 'a', 'n', ',', ' ', 'a', ' ', 'c', 'a', 'n', 'a', 'l', ':', ' ', 'P', 'a', 'n', 'a', 'm', 'a'};
        input = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        System.out.println(input);
        reverseString(input);
        System.out.println(input);
    }

    private static void reverseString(char[] s) {
        int length = s.length;
        for (int i = 0; i < length / 2; i++) {
            // swap
            char tmp = s[i];
            s[i] = s[length - i - 1];
            s[length - i - 1] = tmp;
        }
    }
}
