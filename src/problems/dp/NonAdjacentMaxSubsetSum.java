package problems.dp;

public class NonAdjacentMaxSubsetSum {


    static int maxSubsetSum(int[] arr) {

        int[] memo = new int[arr.length + 2];

        memo[1] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            memo[i + 1] = Math.max(memo[i], Math.max(arr[i] + memo[i - 1], arr[i]));
        }

        return Math.max(0, memo[arr.length]);
    }

}
