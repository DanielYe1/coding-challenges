package contests.three;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P1 {
    public static int solution(int N, String S) {
        HashMap<Integer, List<Character>> map = new HashMap<>();
        String[] seats = S.split(" ");

        int total = 0;

        for (String seat : seats) {
            if (seat.isBlank()) {
                continue;
            }
            int key = Integer.parseInt(seat.substring(0, seat.length() - 1));
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(seat.charAt(seat.length() - 1));
        }

        int size = map.size();
        total += (N - size) * 2;

        for (Map.Entry<Integer, List<Character>> row : map.entrySet()) {
            List<Character> full = row.getValue();
            boolean first = !full.contains('B') && !full.contains('C') && !full.contains('D') && !full.contains('E');
            boolean second = !full.contains('F') && !full.contains('G') && !full.contains('D') && !full.contains('E');
            boolean third = !full.contains('F') && !full.contains('G') && !full.contains('H') && !full.contains('J');
            if (first && third) {
                total += 2;
                continue;
            }
            if (first || second || third) {
                total++;
            }
        }


        return total;
    }

    public static void main(String[] args) {
        System.out.println(solution(1, ""));
    }
}
