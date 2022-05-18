package easy.string;

public class StringToIntegerAtoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("9223372036854775808"));
    }

    private static int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int sign = 1;
        long result = 0;
        s = s.trim(); // not good

        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                if (s.charAt(0) == '-') {
                    sign = -1;
                    continue;
                } else if (s.charAt(0) == '+') {
                    continue;
                }
            }

            if (!Character.isDigit(s.charAt(i))) {
                break;
            }

            result = result * 10 + (s.charAt(i) - '0');
            if (sign * result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (sign * result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        return sign * (int) result;
    }
}
