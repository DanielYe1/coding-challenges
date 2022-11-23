package problems;

public class GridTraveler {

    public static int[][] mat = new int[101][101];

    public static int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (m == 1 && n == 1) {
            return 1;
        }

        if (mat[m - 1][n] == 0) {
            mat[m - 1][n] = uniquePaths(m - 1, n);
        }

        if (mat[m][n - 1] == 0) {
            mat[m][n - 1] = uniquePaths(m, n - 1);
        }

        return mat[m - 1][n] + mat[m][n - 1];
    }

    public static void main(String[] args) {
        int paths = uniquePaths(23, 12);

        System.out.println(paths);
    }
}
