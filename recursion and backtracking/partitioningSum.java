// return true if Decimal number can be partitioned into contiguous substrings such that the sum of the integer values of these substrings equals to k. else false.

// Most IMP 

public class partitioningSum {
    public static void main(String[] args) {
        int num = 1296;  
        int k = 36;       // 1 + 29 + 6
        boolean ans = helper(String.valueOf(num), k);
        System.out.println(ans);
    }

    private static boolean helper(String num, int sum) {
        if(sum < 0) return false;
        if(num.isEmpty() && sum == 0) return true;
        for(int i = 0; i < num.length(); i++)
            if(helper(num.substring(i+1), sum - Integer.parseInt(num.substring(0, i+1)))) return true;
        return false;
    } 
}
