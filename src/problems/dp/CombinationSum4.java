package problems.dp;

public class CombinationSum4 {

    public static int path(int[] candidates, int target, Integer[] memo) {

        if (target < 0) {
            return 0;
        }

        if (memo[target] != null) {
            return memo[target];
        }

        if (target == 0) {
            return 1;
        }

        int ans = 0;
        for (int i = 0; i < candidates.length; i++) {
            ans += path(candidates, target - candidates[i], memo);
        }

        memo[target] = ans;
        return ans;
    }

    public static int combinationSum(int[] candidates, int target) {
        Integer[] memo = new Integer[target + 1];
        return path(candidates, target, memo);
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3};
        int lists = combinationSum(candidates, 35);
        System.out.println(lists);
    }
}
