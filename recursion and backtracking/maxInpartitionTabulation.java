import java.util.*;
public class maxInpartitionTabulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String str = in.next();
        
        long ans = helper(str, k);
        System.out.println(ans);
    }

    private static long helper(String num, int k) {
        int n = num.length();
        long[] dp = new long[n + 1];
        
        for (int i = 1; i <= n; i++) {
            long maxSum = Long.MIN_VALUE;
            for (int j = 1; j <= Math.min(i, k); j++) {
                long partition = Long.parseLong(num.substring(i - j, i));
                long currentSum = dp[i - j] + partition;
                maxSum = Math.max(currentSum, maxSum);
            }
            dp[i] = maxSum;
        }
        
        return dp[n];
    }
}
