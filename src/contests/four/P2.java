package contests.four;

import java.util.Collections;

import static java.util.Arrays.asList;

public class P2 {

    // not aaa bbb 100%

    public static String solution(int AA, int AB, int BB) {
        // Implement your solution here

        StringBuilder ans = new StringBuilder();

        ans.append("AB".repeat(Math.max(0, AB)));

        int min_commons = Collections.min(asList(AA, BB));
        AA -= min_commons;
        BB -= min_commons;

        ans.append("AABB".repeat(Math.max(0, min_commons)));

        if (AA > 0) {
            ans.append("AA");
            return ans.toString();
        } else if (BB > 0) {
            return "BB" + ans;
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(5, 0, 2));
        System.out.println(solution(1, 2, 1));
        System.out.println(solution(0, 2, 0));

        System.out.println(solution(0, 0, 10));
    }
}
