// print all the subsequences whose sum is equal to k;

import java.util.*;
public class subseqPattern1 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        int k = 5;
        List<Integer> list = new ArrayList<>();
        subsequence(arr, 0, list, 0, k);
    }

    private static void subsequence(int[] arr, int index, List<Integer> list, int sum, int k) {
        if(index >= arr.length) {
            if(sum == k) {
                System.out.println(list);
            }
            return;
        }

        list.add(arr[index]);
        sum += arr[index];
        subsequence(arr, index + 1, list, sum, k);
        list.remove(list.size() - 1);
        sum -= arr[index];
        subsequence(arr, index + 1, list, sum, k);
    }
}
