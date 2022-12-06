package contests.one;

import java.util.Arrays;

public class P3 {


    public static int[] solution(int[] A, int F, int M) {
        int sum = Arrays.stream(A).sum();

        int size = A.length + F;

        int total = size * M;

        int missing = total - sum;

        if (missing > F * 6 || missing < F) {
            return new int[]{0};
        }

        int[] sol = new int[F];

        while (missing > 0) {
            for (int i = 0; i < F; i++) {
                missing--;
                sol[i]++;

                if (missing <= 0) {
                    break;
                }

            }
        }

        return sol;
    }

    public static void main(String[] args) {

        int[] ints = {3, 2, 4,3};
        solution(ints, 2, 4);
    }


}
