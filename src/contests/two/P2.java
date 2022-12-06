package contests.two;

import java.util.Arrays;
import java.util.List;

public class P2 {

    int solution(String pattern, String source) {

        StringBuilder bin = new StringBuilder();

        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'y');

        for (int i = 0; i < source.length(); i++) {
            if (vowels.contains(source.charAt(i))) {
                bin.append('0');
            } else {
                bin.append('1');
            }
        }
        String value = bin.toString();

        int size = pattern.length();

        int count = 0;
        for (int i = 0; i < value.length() - size + 1; i++) {
            if (value.substring(i, i + size).equals(pattern)) {
                count++;
            }
        }

        return count;
    }

}
