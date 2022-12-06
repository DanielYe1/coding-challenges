package contests.one;

public class P1 {


    public static int solution(int N) {
        int enable_print = N % 10;
        while (N > 0) {
            if (enable_print != 0 || N % 10 != 0) {
                enable_print = 1;
            }
            if (enable_print != 0) {
                System.out.print(N % 10);
            }
            N = N / 10;
        }
        return N;
    }

    public static void main(String[] args) {

        solution(5908000);
    }


}
