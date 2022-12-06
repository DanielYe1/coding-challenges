package contests.one;

import java.util.Stack;

public class P2 {


    public static int solution(int[] A) {

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            if (stack.isEmpty() || stack.peek() != A[i]) {
                stack.push(A[i]);
            }
        }

        Integer last = null;
        int count = 0;

        while (!stack.isEmpty()) {

            Integer actual = stack.pop();

            if (last == null || stack.isEmpty()) {
                count++;
            } else {
                if (actual > last && actual > stack.peek()) {
                    count++;
                }
                if (actual < last && actual < stack.peek()) {
                    count++;
                }
            }
            last = actual;
        }
        return count;
    }

    public static void main(String[] args) {

        int[] ints = {2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5};
        System.out.println(solution(ints));
    }
}
