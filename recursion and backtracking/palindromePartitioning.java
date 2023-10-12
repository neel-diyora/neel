// very very important question 

import java.util.*;
public class palindromePartitioning {
    public static void main(String[] args) {
        List<List<String>> ans = new ArrayList<>();
        helper("aab", new ArrayList<>(), ans);
        System.out.println(ans);
    }

    private static void helper(String s, List<String> ds, List<List<String>> ans) {
        if(s.isEmpty()) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = 0; i < s.length(); i++) {
            String current = s.substring(0, i+1);
            if(isPalindrome(current)) {
                ds.add(current);
                helper(s.substring(i+1), ds, ans);
                ds.remove(ds.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while(start <= end) {
            if(str.charAt(start++) != str.charAt(end--)) return false;
        }
        return true;
    }
}
