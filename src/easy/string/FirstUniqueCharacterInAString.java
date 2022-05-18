package easy.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        //System.out.println("c".charAt(0) - 'a');
        System.out.println(firstUniqChar("hello"));
        System.out.println(firstUniqChar("loveleetcode"));
    }
    private static int firstUniqChar(String s) {
        int[] dic = new int[26];
        for (int i = 0; i < s.length(); i++) {
            dic[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (dic[s.charAt(i) - 'a'] == 1) return i;
        }

        return -1;
    }
}
