// Decimal number can be partitioned into contiguous substrings such that the sum of the integer values of these substrings is maximized. and the maximum length of each partition is k.

import java.util.*;
public class maxInPartitioning {
    public static void main(String[] args) {
        int ans = helper("311", 1, new HashMap<>());
        System.out.println(ans);
    }

    private static int helper(String num, int k, Map<String, Integer> dp) {
        if(num.isEmpty()) return 0;
        if(dp.containsKey(num)) return dp.get(num);
        
        int maxSum = Integer.MIN_VALUE;
        int i = 0;
        while(i < k && i < num.length()) {
            int partition = Integer.parseInt(num.substring(0, i+1));
            int currentSum = helper(num.substring(i+1), k, dp) + partition;
            maxSum = Math.max(currentSum, maxSum);
            i++;
        }

        dp.put(num, maxSum);
        return maxSum;     
    }
}

// TABULATION (BOTTOM-UP APPROACH)
// import java.util.*;

// public class demo {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int n = in.nextInt();
//         int k = in.nextInt();
//         String str = in.next();
        
//         long ans = helper(str, k);
//         System.out.println(ans);
//     }

//     private static long helper(String num, int k) {
//         int n = num.length();
//         long[] dp = new long[n + 1];
        
//         for (int i = 1; i <= n; i++) {
//             long maxSum = Long.MIN_VALUE;
//             for (int j = 1; j <= Math.min(i, k); j++) {
//                 long partition = Long.parseLong(num.substring(i - j, i));
//                 long currentSum = dp[i - j] + partition;
//                 maxSum = Math.max(currentSum, maxSum);
//             }
//             dp[i] = maxSum;
//         }
        
//         return dp[n];
//     }
// }


