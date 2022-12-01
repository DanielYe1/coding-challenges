package problems.dp;

public class MaxSubSetSum {

    static int higher = 0;

    static boolean subsetSum(int[] arr, int sum, int ind, Boolean[][] memo, int tempCount) {
        if (sum == 0) {
            if(higher> tempCount){
                higher = tempCount;
            }
            return true;
        }
        if (ind < 0) return false;
        if (memo[ind][sum] != null) {
            return memo[ind][sum];
        }

        if (arr[ind] > sum) {
            memo[ind][sum] = subsetSum(arr, sum, ind - 1, memo, tempCount);
            return memo[ind][sum];
        }

        memo[ind][sum] = subsetSum(arr, sum, ind - 1, memo, tempCount) || subsetSum(arr, sum - arr[ind], ind - 1, memo, tempCount+1);
        return memo[ind][sum];
    }

    static Boolean isSubsetSum(int N, int arr[], int sum) {
        return subsetSum(arr, sum, N - 1, new Boolean[N + 1][sum + 1], 0);
    }
}
