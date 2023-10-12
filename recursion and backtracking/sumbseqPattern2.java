// print any one subsequence whose sum is k

import java.util.*;

public class sumbseqPattern2 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 5;
        List<Integer> list = new ArrayList<>();
        subsequence(arr, 0, list, 0, k);
    }

    private static boolean subsequence(int[] arr, int index, List<Integer> list, int sum, int k) {
        if(index >= arr.length) {
            if(sum == k) {
                System.out.println(list);
                return true;
            }
            return false;
        }

        list.add(arr[index]);
        sum += arr[index];
        if (subsequence(arr, index + 1, list, sum, k)) {
            return true;
        }

        list.remove(list.size() - 1);
        sum -= arr[index];
        return subsequence(arr, index + 1, list, sum, k);
    }
}
