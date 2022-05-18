package easy.string;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("hello", "ehllo"));
    }

    private static boolean isAnagram(String s, String t) {
        int[] dic = new int[26];

        for (int i = 0; i < s.length(); i++) {
            dic[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            dic[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < dic.length; i++) {
            if (dic[i] != 0) return false;
        }

        return true;
    }
}
