package easy.string;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(109));
    }

    private static int reverse(int x) {
        //321
        long result = 0;

        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }

        return (int) result == result ? (int) result : 0;
    }
}
