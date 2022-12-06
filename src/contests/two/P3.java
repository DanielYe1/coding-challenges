package contests.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P3 {
    String solution(String[] arr) {

        StringBuilder sol = new StringBuilder();

        List<String> values = new ArrayList<String>(Arrays.asList(arr));

        List<String> toRemove = new ArrayList<String>();

        int actualLetter = 0;
        while (!values.isEmpty()) {
            for (String val : values) {
                if (val.length() == actualLetter) {
                    toRemove.add(val);
                } else {
                    sol.append(val.charAt(actualLetter));
                }
            }
            values.removeAll(toRemove);
            toRemove = new ArrayList<String>();
            actualLetter++;
        }
        return sol.toString();

    }

}
